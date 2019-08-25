package projekt;

import obiekty.PozycjaZamowienia;
import obiekty.Zamowieniee;

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
