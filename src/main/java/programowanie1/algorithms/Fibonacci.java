package pl.sdacademy.java16poz.programowanie1.algorithms;

public class Fibonacci {

    public int recurasive(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return recurasive(n - 1) + recurasive(n - 2);
        }

    }
}


