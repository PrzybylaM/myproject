package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class MockitoAnnotationMockTest {

    @Mock
    List<String> mockedList;

    @Before
    public void before(){
        //zainicjowanie atrapy wykorzystywane w tej klasie(this)
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseMockAnnotationMockInject(){
        mockedList.add("one");
        verify(mockedList.add("one"));
        assertEquals(0,mockedList.size());

        //atrapa zachowania na metode size()
        //zamokujemy metode size()
        when(mockedList.size()).thenReturn(2019);
        assertEquals(2019, mockedList.size());
    }

    @Test
    public void whenUseMockAnnotationOnlyInTest(){
        List onlyHereMockList = Mockito.mock(ArrayList.class);
        onlyHereMockList.add("one");
        verify(onlyHereMockList).add("one");
        assertEquals(0, onlyHereMockList.size());
    }

    @Test
    public void addThreeTimeElementToList(){
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three");

        //weryfikacje czy dodalismy 3 napisy
        verify(mockedList, times(3)).add(anyString());
        verify(mockedList, times(1)).add("one");

    }

    @Test
    public void addThreeTimesElementToList(){
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three");

        // weryfikacje czy dodalismy 3 napisy
        verify(mockedList, times(3)).add(anyString());
        verify(mockedList, times(1)).add("one");
        //verify(mockedList, never()).remove("one");
    }

    /**
     * Zadanie: Utwórz test wykorzystując atrape kalkulatora
     */
    @Test
    public void calculatorMockitoTest(){
        //zdefiniowanie atrapy Calculator
        //atrapa calculatora wyswietla 2019
        //zamokowanie metody display()
        //wywolujemy i wyswietlamy sout display
        //weryfikacja czy metoda display()
        //wykonana została tylko raz - użycie times
        //weryfikaca czy metoda pressNumber(null)
        //nigdy nie została wykonana - użycie never()
    }
}
