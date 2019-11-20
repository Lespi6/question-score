package deqo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    QuestionAChoixExclusif qace;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getEnonce() {
        //
        // Given
        //
        qace = new QuestionAChoixExclusif("Test?", 1);

        //
        // When
        //
        String enonce = qace.getEnonce();

        //
        // Then
        //
        assertEquals("Test?", qace.getEnonce());
    }

    @Test
    public void getEnonceNull() {
        //
        // Given
        //
        qace = new QuestionAChoixExclusif(null, 1);

        //
        // When
        //
        String enonceNull = qace.getEnonce();

        //
        // Then
        //
        assertNull(enonceNull);
    }

    @Test
    public void getScoreForIndice() {
        //
        // Given
        //
        qace = new QuestionAChoixExclusif("Test?", 1);

        //
        // When
        //
        float scoreBonneReponse = qace.getScoreForIndice(1);
        float scoreMauvaiseReponse = qace.getScoreForIndice(0);

        //
        // Then
        //
        assertEquals(scoreBonneReponse, 100, 0.0001);
        assertEquals(scoreMauvaiseReponse, 0, 0.0001);

    }
}