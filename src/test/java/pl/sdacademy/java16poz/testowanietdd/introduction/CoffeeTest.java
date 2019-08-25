package pl.sdacademy.java16poz.testowanietdd.introduction;

import org.junit.Before;
import org.junit.Test;
import testowanietdd.introduction.Cafe;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CoffeeTest {

    /**
     * Test metody która przygotowuje kawe
     */

     private Cafe cafe;

    @Before
    //given
    public void setUp() {
        cafe = new Cafe();
}

    @Test
    public void shouldServiceCoffee() {
        //given
        //Cafe cafe = new Cafe();

        //when
        cafe.serveCoffee();

        //then
        assertTrue("Kawa powinna być podana",cafe.canServeCoffee());
    }

    /**
     * Kawa nie została przygotowana
     */

    @Test
    public void shouldNotServeCoffee(){
        //given
        //Cafe cafe = new Cafe();

        //when
        //cafe.serveCoffee();

        //then
        assertFalse("Kawa nie została podana", cafe.canServeCoffee());

    }

}
