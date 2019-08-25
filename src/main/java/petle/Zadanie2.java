package petle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        /**
         * Zadanie1
         * Wypisz elementy utworzonej wcześniej Listy zawierającą imiona na literę ‚a’ lub zawierającą literę "a"
         * lista 10 imion
         *
         * wersja:
         * a) for
         * b) while
         *
         */

        //List = List<Object>
        List listaImion = new ArrayList();
        listaImion.add("Andrzej");
        listaImion.add("Mirek");
        listaImion.add("Adam");
        listaImion.add("Alicja");
        listaImion.add("Ada");
        listaImion.add("Bogusia");
        listaImion.add("Pawel");
        listaImion.add("Adrian");
        listaImion.add("Janusz");
        listaImion.add("Dżesika");

        for (Object imie : listaImion) {
            String imieString = imie.toString();//  poprawna forma
            //String imieString2 = (String) imie; // rzutowanie
            if(imieString.startsWith("A") || imieString.contains("a")) {
                System.out.println(imie);
            }
        }



        List<String> listaImion2 = new ArrayList();
        listaImion2.add("Andrzej");
        listaImion2.add("Angelika");
        listaImion2.add("Adam");
        listaImion2.add("Alicja");
        listaImion2.add("Ada");
        listaImion2.add("Albert");
        listaImion2.add("Adela");
        listaImion2.add("Adrian");
        listaImion2.add("Artur");
        listaImion2.add("Agata");

        for (String imie : listaImion2) {
            if (imie.toLowerCase().contains("a")) {
                System.out.println(imie);
            }
        }

        //while
        //boolean warunek = true;
        int licznik = 0;
        //dopoki warunek spelniony kod sie wykonuje
        while (licznik<100){
            System.out.println(".");
            //co dziesiata kropka ma byc kolkiem "o"

            if(licznik%10==0){
                System.out.println("o");
            }else{
                System.out.println(".");
            }
            licznik++;
//            if (licznik > 100){
//                warunek = false;
//            }
        }
        //zakonczenie po 100


    }
}
