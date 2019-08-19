package pl.sdacademy.java16poz.programowanie1.algorithms;

public class Factorial {

    public int result(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n + result(n-1);
        }

    }

}
