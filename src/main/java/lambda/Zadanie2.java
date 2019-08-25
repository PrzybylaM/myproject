package lambda;

import java.util.Arrays;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {

        /**
         * Stwóz liste 10 imion za pomoca strema wypisz imiona zawierajace litere A
         * kończąca się na litere A, wieksza niz 5 znakow oraz wypisz liste pofiltrowana
         */

        List imie = Arrays.asList("Kasia", "Iza", "Stefan", "Marika", "Paweł", "Mariusz", "Przemek", "Iga", "Gertruda", "Adam");
        imie.stream().filter(a ->a.toString().startsWith("a")).map(a->a.toString().toUpperCase()).sorted().forEach(System.out::println);


    }
}
