package pl.sdacademy.java16poz.klasy;

import pl.sdacademy.java16poz.obiekty.Zamowieniee;
import pl.sdacademy.java16poz.projektZamowienia.Kurczak;
import pl.sdacademy.java16poz.projektZamowienia.Zamowienie;

import java.util.ArrayList;
import java.util.List;

public class ZamowieniaMain {

    public static void main(String[] args) {

        Zamowieniee zamowienie1 = new Zamowieniee(1);
        //pobieranie ceny zamowienia i wyswietlanie w konsoli
        float aktualnaKwotaDoZaplaty = zamowienie1.pobierzCena();
        System.out.println("Aktualny stan rachunku: "+aktualnaKwotaDoZaplaty);

        /*
        Zadanie domowe
        ----------------------------------------
        dodaj metodę dodajPozycje(float cena)
        dodaj kilka pozycji do zamowienia i na końcu pobierzCene()
        i wyświetl mini rachunek
         */

        zamowienie1.dodajPozycje("Pomidor", 1.22f);
        zamowienie1.dodajPozycje("Chleb",3.44f);
        zamowienie1.dodajPozycje("Bulka",10f);
        zamowienie1.dodajPozycje("Ser",10f);
        //zamowienie1.wypiszPozycje();
        /**
         * Zadanie domowe:
         * WYpisac na konsole z uzyciem petli ladnie- pretty print
         *
         * zad.2
         *
         * w petli przypisac sume
         */
        //do poprawki cena zamowienia
        float cenaZamowienia = zamowienie1.pobierzCena();
        //.2f - dwa miejsca po przecinku f - float
        System.out.printf("Cena zamowienia: %.2f zł",cenaZamowienia);



    }



}

