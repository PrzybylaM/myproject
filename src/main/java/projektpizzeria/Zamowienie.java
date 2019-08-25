package projektpizzeria;

import obiekty.PozycjaZamowienia;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {

    int number;
    int numer;
    private float cena;

    private List<PozycjaZamowienia1> listaPozycji;

    public List<PozycjaZamowienia1> pobierzPozycje(){
        return listaPozycji;
    }

    /**
     * Konstruktor tworzacy zamowienie
     * @param numer zamowienia
     */
    public Zamowienie(int numer){
        this(numer,0);
    }

    public Zamowienie(int numer,float cena){
        this.numer = numer;
        this.cena = cena;
        // ArrayList to implementacja interfejsu List
        // inicjalizacja zmiennej typu List
        this.listaPozycji = new ArrayList<>();
    }

    public void ZamowienieWyswietl(){
        this.number = number;
        System.out.println(listaPozycji.get(number));
    }

    public void dodajPozycje(String nazwa, float cenaPozycji){
        //utworzenie pozycji
        PozycjaZamowienia1 pozycja = new PozycjaZamowienia1(nazwa, cenaPozycji);
        //dodawanie pozycji
        listaPozycji.add(pozycja);
    }

    public int pobierzNumer(){
        return numer;
    }

}
