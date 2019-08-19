package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void before () {
        //given
        calc = new CalculatorImpl();
    }


    @Test
    public void shouldDisplayNumber(){

        //when
        calc.pressNumber(2);
        calc.pressNumber(0);
        calc.pressNumber(1);
        calc.pressNumber(9);

        //when
        String expected = "2019";
        String actual = calc.display();
        calc.display();

        assertEquals(String.format("Na wyswietlaczu powinno być 2019 a jest ",actual),expected,actual);

    }


    @Test
    public void shouldNotDisplayNumber(){

        //when
        //nothing

        //then
//        String zawartoscWyswietlacza = calc.display();
//        boolean czyJestPusta = zawartoscWyswietlacza.isEmpty();
//        assertTrue("Wyswietlacz powinien byc pusty", czyJestPusta);

        assertTrue("Wyswietlacz powinien być pusty",calc.display().isEmpty());
    }

    @Test
    public void shouldAddSuccessedExecute(){
        calc.add(1,2);
        assertEquals("Sprawdza czy wynik jest 3",calc.display(),"3");
        calc.clear(); //brakuje metody, należy ją dodać

        calc.add(4,3);
        assertEquals("Sprawdza czy wynik jest 7",calc.display(),"7");
        calc.clear();

        calc.add(2,7);
        assertEquals("Sprawdza czy wynik jest 9",calc.display(),"9");
        calc.clear();

        calc.add(4,6);
        assertEquals("Sprawdza czy wynik jest 10",calc.display(),"10");
        calc.clear();

        calc.add(3,3);
        assertEquals("Sprawdza czy wynik jest 6",calc.display(),"6");
        calc.clear();

    }

    @Test
    public void shouldSubSuccessedExecute(){
        calc.sub(4,2);
        assertEquals("Sprawdza czy wynik jest 2",calc.display(),"2");
        calc.clear(); //brakuje metody, należy ją dodać

        calc.sub(4,3);
        assertEquals("Sprawdza czy wynik jest 1",calc.display(),"1");
        calc.clear();

        calc.sub(10,7);
        assertEquals("Sprawdza czy wynik jest 3",calc.display(),"3");
        calc.clear();

        calc.sub(8,6);
        assertEquals("Sprawdza czy wynik jest 2",calc.display(),"2");
        calc.clear();

        calc.sub(3,3);
        assertEquals("Sprawdza czy wynik jest 0",calc.display(),"0");
        calc.clear();

    }



}