package pl.sdacademy.java16poz.testowanietdd.calculator;

import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import testowanietdd.calculator.Calculator;
import testowanietdd.calculator.CalculatorImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static testowanietdd.calculator.CalculatorImpl.DIV_ERROR_MESSAGE;


public class CalculatorExteptionTest {

    Calculator calc;

    @Before
    public void setUp(){
        //given
        calc = new CalculatorImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveExceptionWhenDevideByZero() {

        //when
        calc.clear();
        calc.div(1,0);

        //then
    }

    @Test
    public void shouldHaveExceptionWhenDevideByZeroAssert(){

        try{
            calc.div(100,0);
        }catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().equals(DIV_ERROR_MESSAGE));
        }
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldHaveExceptionWhenDevideByZeroRule(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(DIV_ERROR_MESSAGE);
        calc.div(100,0);
    }
}
