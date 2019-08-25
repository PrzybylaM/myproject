package pl.sdacademy.java16poz.testowanietdd.calculator;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import testowanietdd.calculator.Calculator;
import testowanietdd.calculator.CalculatorImpl;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJUnitParamsCSVTest {

    Calculator calc;

    @Before
    public void setUp(){
        //given
        calc = new CalculatorImpl();
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileAddTest.csv")
    public void addTest(int number1, int number2, String number){

        //when
        calc.clear();
        calc.add(number1,number2);
        String actual = calc.display();

        //then
        String message = String.format("Wartość %d+%d dodawania powinna być równa %s", number1, number2, number);
        assertEquals(message,number, actual);
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileDivTest.csv")
    public void DivTest(int number1, int number2, String number){

        //when
        calc.clear();
        calc.div(number1,number2);
        String actual = calc.display();

        //then
        String message = String.format("Wartość %d+%d dodawania powinna być równa %s", number1, number2, number);
        assertEquals(message,number, actual);
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileDivTest.csv")
    public void MultiTest(int number1, int number2, String number){

        //when
        calc.clear();
        calc.multi(number1,number2);
        String actual = calc.display();

        //then
        String message = String.format("Wartość %d+%d dodawania powinna być równa %s", number1, number2, number);
        assertEquals(message,number, actual);
    }





//    @Test
//    @Parameters(method = "parametersToTestAdd")
//    public void minAndMaxValueInAddTest(){
//
//    }

}
