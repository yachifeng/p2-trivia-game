package main.java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Handles SQLite database connections and table creation to ensure data persistence for users, questions, and scores.
 *
 * @author Yachi Feng
 * @version 21.0.10
 * @since 4/12/26
 */

public class DatabaseManager {
    private static final String URL = "jdbc:sqlite:trivia_game.db";

    /**
     * Establishes a connection to the SQLite database using the predefined JDBC URL.
     * This method serves as a central factory for obtaining database connections
     * required for CRUD operations across the application.
     *
     * @return A {@link java.sql.Connection} object representing the active database session.
     * @throws Exception if the JDBC driver is missing or if the database file cannot be accessed.
     */
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL);
    }

    /**
     * Initializes the database schema by creating the required tables if they do not already exist.
     * This method ensures that the USERS, QUESTIONS, and SCORES tables are set up according to ERD.
     * * It handles the creation of:
     * - USERS: Stores account credentials and roles.
     * - QUESTIONS: Maintains the trivia question bank.
     * - SCORES: Tracks user performance with foreign key constraints.
     */
    public static void initializeDatabase() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            // Create USERS table (R01 Requirement)
            stmt.execute("CREATE TABLE IF NOT EXISTS USERS (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "username TEXT UNIQUE, password TEXT, role TEXT)");

            // Create QUESTIONS table (R01 Requirement)
            stmt.execute("CREATE TABLE IF NOT EXISTS QUESTIONS (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "category_id INTEGER, question_text TEXT, " +
                    "option_a TEXT, option_b TEXT, option_c TEXT, option_d TEXT, " +
                    "correct_answer TEXT)");

            // Create SCORES table (R01 Requirement)
            stmt.execute("CREATE TABLE IF NOT EXISTS SCORES (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "user_id INTEGER, score INTEGER, date_taken DATETIME, " +
                    "FOREIGN KEY(user_id) REFERENCES USERS(id))");

            System.out.println("Database tables initialized successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
