package pl.sdacademy.java16poz.projekt;

import pl.sdacademy.java16poz.obiekty.PozycjaZamowienia;
import pl.sdacademy.java16poz.obiekty.Zamowieniee;

public class Wypisz {
    public static void daneOZamowieniu(Zamowieniee element){
        element.wypiszRachunek();
    }

    public static void nieZnaleziono() {
        System.out.println("Nie znaleziono");
    }

    public static void daneoPozycji(PozycjaZamowienia pozycja){

    }
}
