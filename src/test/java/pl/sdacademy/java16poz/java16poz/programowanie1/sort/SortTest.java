package pl.sdacademy.java16poz.java16poz.programowanie1.sort;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.java16poz.programowanie1.TestBase;
import programowanie1.sort.*;


public class SortTest extends TestBase {
    //stworz tablice o nazwie numbers
    //zawieraja liczby z tablicy (1,3,80,5,67,3,2,57,32,79)
    //stworz metode setUp
    //tablica bedzie zainicjalizowana w metodzie setUp

    int[] numbers;
    private int[] sortedNumbers;

    @Before

    public void setUp() {
        numbers = initNumbers (1,3,80,5,67,3,2,57,32,79);
        sortedNumbers = initNumbers(1,2,3,3,5,32,57,67,79,80);
    }



    @Test
    public void bubbleSortTest(){
        //w tym miejscu testujemy sortowanie babelkowe
        //test powinien wczytac i wydrukowac
        AlgorithmSort algorithmSort = new BubbleSort();
        algorithmSort.load(numbers);
        algorithmSort.sort();
        algorithmSort.print();
        assertTable("Tablica powinna być posortowana", algorithmSort.get(),sortedNumbers);
    }



    @Test
    public void SelectionSortTest(){
        AlgorithmSort algorithmSort = new SelectionSort();
        algorithmSort.load(numbers);
        algorithmSort.print();
        algorithmSort.sort();
        algorithmSort.print();
        assertTable("Tablice powinny byc posortowane", algorithmSort.get(),sortedNumbers);
    }

    @Test
    public void InsertionSortTest(){
        AlgorithmSort algorithmSort = new InsertionSort();
        algorithmSort.load(numbers);
        algorithmSort.sort();
        algorithmSort.print();
        assertTable("Tablice powinny byc posortowane", algorithmSort.get(),sortedNumbers);
    }


    @Test
    public void QuickSortTest(){
        AlgorithmSort algorithmSort = new QuickSort();
        algorithmSort.load(numbers);
        algorithmSort.sort();
        algorithmSort.print();
        assertTable("Tablice powinny byc posortowane", algorithmSort.get(),sortedNumbers);
    }
}
