## Title
BrainQuest: A JavaFX-Based Interactive Trivia & Study Management System

## Brief Description
An interactive desktop learning tool developed with JavaFX and SQLite.  The application features a dual-user system (Regular/Admin), enabling students to engage with multiple-choice quizzes and track progress via a dynamic leaderboard, while administrators manage the question bank and oversee user performance.

## Project Organization
1. src/main/java/trivia/: Contains Java logic (Controllers, DAOs, Database management).
2. src/main/resources/trivia/: Contains FXML UI files.
3. src/test/java/trivia/: Contains JUnit 5 unit tests.

## IDE Setup (IntelliJ)
1. **Right-click** on `src/main/java` and select **Mark Directory as -> Sources Root**.
2. **Right-click** on `src/main/resources` and select **Mark Directory as -> Resources Root**.
3. **Right-click** on `src/test/java` and select **Mark Directory as -> Test Sources Root**.
4. Ensure JDK 21 (or higher) and JavaFX 21 (or higher) are configured in the Project Structure.

## Database
The project uses SQLite.  The database file trivia_game.db will be automatically generated upon first run via DatabaseManager.  Currently implemented tables: USERS, QUESTIONS, SCORES.
