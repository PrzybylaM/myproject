package pl.sdacademy.java16poz.tablice;

import pl.sdacademy.java16poz.obiekty.Zamowieniee;
import pl.sdacademy.java16poz.projektZamowienia.Zamowienie;

public class TabliceMain {
    public static void main(String[] args) {

        /**
         * Utwórz tablicę zawierającą
         * 4 elementy i 5 miast
         */


        int[]tablicaLiczb = new int[4];
        tablicaLiczb[0]=2342;
        tablicaLiczb[1]=22;
        tablicaLiczb[2]=11;
        tablicaLiczb[3]=1;


        String[]Tab1 = {"Poznan", "Wrocław", "Wolsztyn", "Gdańsk", "Gdynia"};

        //Wypisz 3 elementy z tablicy
        //tablica liczb
        System.out.println(tablicaLiczb[2]);

        //Tab1
        System.out.println(Tab1[2]);


        //Zadanie
        //Utwórz dablice zamowien  dodaj do tablicy zamowienia
        Zamowieniee[]tablicaZamowien = new Zamowieniee[2];
        tablicaZamowien[0] = new Zamowieniee(1);
        tablicaZamowien[1] = new Zamowieniee(2);

        System.out.println("Wyświetl zamówienie: ");
        System.out.println();




    }
}
