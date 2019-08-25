package pl.sdacademy.java16poz.programowanie2.weryfikacjaID;

import org.junit.Test;
import programowanie2.weryfikacjaID.VerificationID;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class VerificationIDTest {


    @Test
    void should3LetterInStartNumber() {

        /**
         * Test poprawny, lecz nie do końca sprawdzający metodę
         */

        String numberCard = "CDL539091";

        VerificationID card = new VerificationID();
//        int letter1 = card.map.get(numberCard.charAt(0));
//        int letter2 = card.map.get(numberCard.charAt(1));
//        int letter3 = card.map.get(numberCard.charAt(2));

//        assertTrue(10 <= letter1 && letter1 <= 35);
//        assertTrue(10 <= letter2 && letter2 <= 35);
//        assertTrue(10 <= letter3 && letter3 <= 35);
    }

    @Test
    void checkIds() {

        /**
         * Testujemy tylko poprawność działania metod
         */

        List<String> uncheckIds = new ArrayList<>();
        uncheckIds.add("CDL539091");
        uncheckIds.add("CDL532342342349091");
        uncheckIds.add("CDL539091");

        //List<String> correct = new VerificationID().checkIds(uncheckIds);

        //assertEquals(2, correct.size());
    }
}

