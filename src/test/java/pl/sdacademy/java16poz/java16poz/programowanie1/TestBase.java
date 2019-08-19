package pl.sdacademy.java16poz.java16poz.programowanie1;

import org.junit.Rule;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * TestBase
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 08:57
 **/
public class TestBase {

    private static final Logger logger = Logger.getLogger("");

    private static void logInfo(Description description, String status, long nanos) {
        String testName = description.getMethodName();
        logger.info(String.format("\t---\n\tTest %s %s, spent %d microseconds",
                testName, status, TimeUnit.NANOSECONDS.toMicros(nanos)));
    }

    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            logInfo(description, "succeeded", nanos);
        }

        @Override
        protected void failed(long nanos, Throwable e, Description description) {
            logInfo(description, "failed", nanos);
        }

//        @Override
//        protected void skipped(long nanos, AssumptionViolatedException e, Description description) {
//            logInfo(description, "skipped", nanos);
//        }

        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, "finished", nanos);
        }
    };

    protected int[] initNumbers(int... numbers) {
        return numbers;
    }

    protected void assertTable(String message, int[] table1, int[] table2) {
        // Sprawdzenie czy tablice są równej długosci
        // Sprawdzenie petli czy elementy obu tablic sa rowne 0
        assertTrue(message, table1.length == table2.length);
        //assertTrue("Tablice powinny miec ta sama zawartosc", );
        for (int i = 0; i < table1.length; i++){
            assertTrue(message, table1[i] == table2[i]);
        }
    }
}
