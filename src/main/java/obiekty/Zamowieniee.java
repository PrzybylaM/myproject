package obiekty;

import projekt.ProjektUtils;
import projektZamowienia.Zamowienie;

import java.util.ArrayList;
import java.util.List;

public class Zamowieniee {

    /**
     * Utwórz klasę Zamówienie
     * Dodaj pola numer oraz cena
     * Utwórz metodę pobierzCena() wypisującą cene
     */

    // dodajemy pola
    // dodajemy pola
    int numer;
    private float cena;
    // lista elementow PozycjaZamowienia
    private List<PozycjaZamowienia> listaPozycji;

    public List<PozycjaZamowienia> pobierzPozycje(){
        return listaPozycji;
    }

    /**
     * Konstruktor tworzacy zamowienie
     * @param numer zamowienia
     */
    public Zamowieniee(int numer){
        this(numer,0);
    }

    public Zamowieniee(int numer, float cena){
        this.numer = numer;
        this.cena = cena;
        // ArrayList to implementacja interfejsu List
        // inicjalizacja zmiennej typu List
        this.listaPozycji = new ArrayList<>();
    }

    // dodajPozycje w zamowieniu

    public float pobierzCena(){
        return cena;
    }

    public void przelicz(){
        float sumaWszystkichPozycji = 0;
        for(PozycjaZamowienia pozycja : listaPozycji){
            float cena = pozycja.pobierzCene();
            sumaWszystkichPozycji += cena;
        }
        cena = sumaWszystkichPozycji;// cena całego zamówienia
    }

    public void wypiszRachunek(){
        // wypisanie pozycji
        for(PozycjaZamowienia pozycja : listaPozycji){
            pozycja.prettyPrint();
        }
        //ładnie wypisać sume
        przelicz();
        float cenaZamowienia = pobierzCena();
        StringBuilder rachunek = new StringBuilder();
        rachunek.append("===========================\n");
        rachunek.append("\tPodsumowanie:\n");
        // .2f - dwa miejsca po przecinku f-float
        String cenaZamowieniaNapis = String.format("\tSuma: \t\t\t\t%.2f zł",cenaZamowienia);
        rachunek.append(cenaZamowieniaNapis).append("\n");

        float podatekProcent = 8;
        float podatek = cenaZamowienia*(podatekProcent/100);
        float brutto = cenaZamowienia;
        float netto = brutto-podatek;

        String bruttoNapis = String.format("\tBrutto: \t\t\t%.2f zł",brutto);
        rachunek.append(bruttoNapis).append("\n");

        String nettoNapis = String.format("\tNetto: \t\t\t\t%.2f zł",netto);
        rachunek.append(nettoNapis).append("\n");

        String podatekNapis = String.format("\tPodatek: %.2f zł",podatekProcent,podatek);
        rachunek.append("\tPodatek ").append(podatekProcent).append("% :")
                .append(String.format("\t\t%.2f zł",podatek)).append("\n");

        // TODO Zadanie wypisywanie rachunku
        // oblicz podatek 8%
        // wypisz brutto i netto - pretty print
        System.out.println(rachunek);
    }

    public String toString(){
        return "Zamowienie nr:"+numer+" cena:"+ ProjektUtils.wypiszKwote(cena);
    }

    public void dodajPozycje(String nazwa, float cenaPozycji) {
        // utworzenie pozycji
        PozycjaZamowienia pozycja = new PozycjaZamowienia(nazwa,cenaPozycji);
        // dodania pozycji
        listaPozycji.add(pozycja);
    }

    public int pobierzNumer() {
        return 0;
    }

    public void dodajPozycje(PozycjaZamowienia pobranieZamowienia) {
        listaPozycji.add(pobranieZamowienia);
    }
}

