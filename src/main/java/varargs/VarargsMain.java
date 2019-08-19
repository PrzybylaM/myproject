package pl.sdacademy.java16poz.varargs;

import java.util.ArrayList;
import java.util.List;

public class VarargsMain {


    public static void wypisz(int... tablica) {
        for (int i = 0; i < tablica.length; i++) {
            //element z tablicy tablica[1]
            System.out.print(tablica[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.printf("%d,%d,%d\n", 1, 2, 3);
        System.out.printf("%d,%d\n", 1, 2);
        System.out.printf("%d\n", 1);

        wypisz(1, 2, 3);
        wypisz(1, 2);
        wypisz(1);

        System.out.println();
        System.out.println();

        List<Integer> listaLiczb = new ArrayList<>();
        listaLiczb.add(1);
        listaLiczb.add(2);
        listaLiczb.add(3);
        //...

        dodajDoListy(listaLiczb,1, 2, 3);
        wypiszListe(listaLiczb);

        dodajDoListy(listaLiczb,4,5,6,7,8,9);
        wypiszListe(listaLiczb);
        // wypisać i sprawdzić czy dodało poprawnie

        List<Integer> listaNowychLiczb = stworzListeLiczb(32,34,233,234,12);
        wypiszListe(listaNowychLiczb);


    }

    /**
     * Zadanie: Wykorzystaj ... i zaimplementuj metode ktora zwraca liste liczb
     * @param i
     * @param i1
     * @param i2
     * @param i3
     * @param i4
     * @return
     */

    private static List<Integer> stworzListeLiczb(int... listaNowychLiczb) {
        //tworzenie listy liczb
        List<Integer> listaLiczb= new ArrayList<>();
        for (int liczba : listaLiczb){
            //jak pobrać z tablicy
            //tablicaLiczb[liczba];
            //jak dodac do listy?
            listaLiczb.add(liczba);

        }

        //zwracamy liczbę liczb
        return listaLiczb;
    }



    private static void wypiszListe(List<Integer> listaLiczb) {
        // TODO Zadanie wypisz zawartość listy z użyciem pętli
        for (int liczba : listaLiczb){
            System.out.println(liczba);
        }
    }


    private static void dodajDoListy(List<Integer> listaLiczb, int... liczbyTablica) {
        /**
         * Zadanie
         */
        // for - petla
        // w pętli dodawać elementy tablicy do listy
        listaLiczb.add(1);

        for (int i = 0; i < liczbyTablica.length; i++) {
            System.out.print(liczbyTablica[i]);
            int elementTablicy = liczbyTablica[i];
            listaLiczb.add(elementTablicy);
        }




    }
}
