package projekt;

import obiekty.PozycjaZamowienia;
import obiekty.Zamowieniee;

import java.util.HashMap;
import java.util.Map;

public class BazaPozycjiMenu extends HashMap<Integer, PozycjaZamowienia> {


    /**
     * konstruktor który tworzy baze w pozycji
     */

    public BazaPozycjiMenu() {
        super(); //tworzenie mapy
        put(1, new PozycjaZamowienia("Frytki", 10));
        put(2, new PozycjaZamowienia("Hamburger", 7));
        put(3, new PozycjaZamowienia("Cola", 5));
    }

    public PozycjaZamowienia pobierzPozycje(int numerPozycji) {
        return get(numerPozycji);
    }

    public boolean czyZawiera(int numerPozycji) {
        return containsKey(numerPozycji);
    }

    public void wypiszPozycje() {
        StringBuilder podsumowanieNapis = new StringBuilder();

        for (Entry<Integer, PozycjaZamowienia> element : entrySet()) {
            int numer = element.getKey();
            PozycjaZamowienia pozycja = element.getValue();
            float cena = pozycja.pobierzCene();
            String nazwa = pozycja.pobierzNazwe();
            podsumowanieNapis.append(numer).append(" ").append(nazwa).append(" ").append(cena).append("\n");

            System.out.println(podsumowanieNapis.toString());
            //System.out.println(element.getKey());
            //System.out.println(element.getValue());
            //TODO dodaj metode toString do klasy PozycjaZamowienie
            //TODO użyj StringBuilder do wypisania powyższych informacji
        }
    }
}
