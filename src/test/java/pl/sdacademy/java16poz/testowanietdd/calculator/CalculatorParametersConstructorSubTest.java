package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import testowanietdd.calculator.Calculator;
import testowanietdd.calculator.CalculatorImpl;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorParametersConstructorSubTest {

    int numberA;
    int numberB;
    String expectedResult;

    public CalculatorParametersConstructorSubTest(int numberA, int numberB, String expectedResult){
        this.numberA = numberA;
        this.numberB = numberB;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Test: {0} - {1} = {2}")
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{{4,2,"2"},{7,3,"4"},{8,7,"1"},{15,7,"8"}});
    }

    @Test
    public void shouldAddSuccessedExecuteTest(){

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.sub(numberA,numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}
