package pl.sdacademy.java16poz.java16poz.programowanie1.algorithms;

import org.junit.Before;
import org.junit.Test;
import pl.sdacademy.java16poz.java16poz.programowanie1.TestBase;
import programowanie1.algorithms.Fibonacci;

public class FibonacciTest extends TestBase {
    int[] numbers;
    private Fibonacci fibonacci;

    @Before
    public void setup(){
        numbers = initNumbers(0,1,1,2,3,5,8,13,21,34);
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciTest(){
    //wykorzystujac petle utwórz tablice wypelnioną liczbami fibonacci
        // wykorzystując pętle utwórz tablice wypełnioną
        // petla od 0 do 9
        // liczbami fibonaccci

        int[] tab = new int[10];
        for (int i = 0; i<tab.length;i++){
            tab[i] = fibonacci.recurasive(i);
        }
        for (int k = 0; k<numbers.length; k++){
            System.out.print(numbers[k]+" ");
        }
        System.out.println("\n----------------------------------\n");
        for (int j =0; j<tab.length;j++){
            System.out.print(tab[j]+" ");
        }

        assertTable("Tablice powinny być równe", numbers, tab);

    }
}
