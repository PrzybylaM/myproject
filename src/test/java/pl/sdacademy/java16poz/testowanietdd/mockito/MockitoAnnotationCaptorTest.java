package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.sdacademy.java16poz.testowanietdd.calculator.Calculator;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoAnnotationCaptorTest {

    @Before
    public void before(){
        //zainicjowanie atrapy wykorzystywane w tej klasie(this)
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    List mockedListObject;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Test
    public void whenUseCaptorAnnotation(){
        mockedListObject.add("one");

        //uruchamiamy przechwytywacza
        verify(mockedListObject).add(argumentCaptor.capture());
        assertEquals("one",argumentCaptor.getValue());
    }

    @Test
    public void calculatorPressNumberCaptorTest(){
        //inicjacja mock Calculatora
        Calculator calc = mock(Calculator.class);

        //powołanie przechwytywania
        ArgumentCaptor<Object> argumentCaptor = ArgumentCaptor.forClass(Integer.class);

        //wykonać metodę pressNumber(2)
        calc.pressNumber(2);

        //weryfikacja przechwyconego argumentu
        verify(calc).pressNumber(argumentCaptor.capture());

        assertEquals(2,argumentCaptor.getValue());
    }
}
