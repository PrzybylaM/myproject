package pl.sdacademy.java16poz.testowanietdd.calculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import testowanietdd.calculator.Calculator;
import testowanietdd.calculator.CalculatorImpl;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParameterizedJUnitParamTest {

    Calculator calc;

    @Before
    public void setUp(){
        //given
        calc = new CalculatorImpl();
    }

    @Test
    @Parameters({
            "1,1,2",
            "2,2,4",
            "5,5,10"
    })
    public void testMulti(int numberA, int numberB, String expected){

        //when
        calc.clear();
        calc.add(numberA,numberB);
        String actual = calc.display();

        //then
        String message = String.format("Wartość %d+%d dodawania powinna być równa %s", numberA, numberB, expected);
        assertEquals(message,expected, actual);
    }

}
