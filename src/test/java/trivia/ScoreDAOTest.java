package trivia;

import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Anthony Ou
 * @version 0.1.0
 * @since 4/13/26
 *
 * Unit test for the ScoreDAO class
 */

public class ScoreDAOTest{

    private ScoreDAO scoreDAO = new ScoreDAO();


    /**
     * Initializes database before any tests are executed
     * to ensure required tables exist for testing.
     */
    @BeforeAll
    public static void setup() {
        DatabaseManager.initialiazeDatabase();
    }


    /**
     * Cleans up test data after each test case.
     * Maintains the testing environment.
     */
    @AfterEach
    public void tearDown() {
        scoreDAO = deleteScoresByUser(1);
    }


    /**
     * To test insert and retireval functions of ScoreDAO.
     * Verifies the scores inserted into the database so
     * it can successfully retrieve and match expected values.
     */
    @Test
    public void testInsertAndRetrieveScores() {

        // Insert test scores
        scoreDAO.insertScore(1, 70);
        scoreDAO.insertScore(1, 80);

        // To retrieve scores
        List<ScoreRecord> scores = scoreDAO.getUserScores(1);

        // to verify results
        assertNotNull(scores, "List of scores should not be null.");
        assertTrue(scores.size() >= 2, "Retrieve at least 2 scores.");

        // Checks recent score
        assertEquals(90, scores.get(0).getScore());

    }


}