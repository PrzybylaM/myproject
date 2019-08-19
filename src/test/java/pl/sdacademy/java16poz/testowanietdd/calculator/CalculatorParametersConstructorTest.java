package pl.sdacademy.java16poz.testowanietdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorParametersConstructorTest {

    int numberA;
    int numberB;
    String expectedResult;

    public CalculatorParametersConstructorTest(int numberA, int numberB, String expectedResult){
        this.numberA = numberA;
        this.numberB = numberB;
        this.expectedResult = expectedResult;
    }

    //statyczna metoda z danymi do testów
    @Parameterized.Parameters(name = "Test[index]: {0} + {1} = {2}")
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{{1,2,"3"},{7,3,"10"},{6,7,"13"}});

    }

    @Test
    public void shouldAddSuccessedExecuteTest(){

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}
