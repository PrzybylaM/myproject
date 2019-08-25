package dziedziczenie;

import obiekty.PozycjaZamowienia;

public class DziedziczenieMain {
    public static void main(String[] args) {

        PozycjaZamowienia pozycjaZamowienia = new PozycjaZamowienia("Frytki",5.99f);
        // pozycjaZamowienia jest obiektem - rozszerza klase Object
        // posiada jej wlasciwosci
        pozycjaZamowienia.hashCode();
    }
}
