package pl.sdacademy.java16poz.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Zadanie1 {
    public static void main(String[] args) {

        /**
         * Stwórz tablicę 5 nazw pozycji Strignów =, oraz wypisz z uzyciem petli for
         */

        String[] tab = new String[5];
        String[] tab1 = {"Aaa", "Bbb", "Ccc", "Ddd", "Eee"};
        tab[0] = "Krakow";
        tab[1] = "Poznan";
        tab[2] = "Warszawa";
        tab[3] = "Wroclaw";
        tab[4] = "Gdańsk";

        WypiszElementyTablicy(tab);


        /**
         * Wykonaj powyższe z uzyciem streama
         */
        Arrays.stream(tab).forEach(p-> System.out.println(p)); //stream
        Arrays.asList(tab).forEach(System.out::println); //to jest lista

        /**
         * Sortowanie bez użycia lambdy
         */
        Comparator<String> sortujPoNazwie = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
        Arrays.sort(tab, sortujPoNazwie);

        WypiszElementyTablicy(tab);


    }

    private static void WypiszElementyTablicy(String[] tab) {
        for (String wy : tab) {
            System.out.println(wy);
        }
    }
}
