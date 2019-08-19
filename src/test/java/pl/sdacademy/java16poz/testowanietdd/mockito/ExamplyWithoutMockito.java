package pl.sdacademy.java16poz.testowanietdd.mockito;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ExamplyWithoutMockito {

    List<String> mockedList;

    @Before
    public void before(){
        mockedList = new ArrayList<>();

    }

    @Test
    public void whenUseWithoutMockAnnotationTest(){
        mockedList.add("one");
        assertEquals(1, mockedList.size());
    }
}
