package pl.sdacademy.java16poz.projekt;

import pl.sdacademy.java16poz.obiekty.PozycjaZamowienia;
import pl.sdacademy.java16poz.obiekty.Zamowieniee;
import pl.sdacademy.java16poz.obiekty.Zamowieniee;
import pl.sdacademy.java16poz.projektpizzeria.Zamowienie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * MenuMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 06.04.2019 15:41
 **/
public class ProjektMain {

    public static void main(String[] args) {

        Menu menu = new Menu();
        List<Zamowieniee> listaZamowien = new ArrayList<>();
        //listaZamowień.size(); // numer zamówienia

        while(true) {// TODO dodaj przełącznik boolean który kończy
            menu.wyswietl();
            OpcjaMenu opcja = menu.pobierzWybor();

            Scanner skaner = new Scanner(System.in);
            switch (opcja) {
                case ZAKONCZ:
                    System.out.println("Do widzenia");
                    // TODO użycie przełącznika na zakończ
                    break;
                case ZLOZ_ZAMOWIENIE:
                    //  zebranie danych do zamówienia
                    // tworzymy nowe zamówienie
                    int numer = listaZamowien.size()+1;
                    Zamowieniee zamowienie = new Zamowieniee(numer);
                    // TODO dodajemy do listy zamówień
                    BazaPozycjiMenu mapaPozycji = new BazaPozycjiMenu();
                    mapaPozycji.wypiszPozycje();
                    System.out.println("Podaj numer: ");
                    int numerPozycji = skaner.nextInt();
                    PozycjaZamowienia pobranieZamowienia = mapaPozycji.pobierzPozycje(numerPozycji);
                    zamowienie.dodajPozycje(pobranieZamowienia);
                    /*System.out.println("Podaj nazwę pozycji:");
                    String nazwa = skaner.nextLine();
                    // TODO pobieranie ceny
                    System.out.println("Podaj cene pozycji:");
                    float cena = skaner.nextFloat();
                    // TODO poniżej wstaw pobraną cenę
                    // dodajemy pozycję do zamówienia
                    zamowienie.dodajPozycje(nazwa,12.33f);
                    // TODO dodatkowo dodawanie wielu pozycji
                    */
                    break;
                case STAN_ZAMOWIENIA:
                    // TODO wprowadź numer skanerem z klawiatury
                    int szukanyNumerZamowienia = skaner.nextInt();
                    // TODO filtrowanie listy zamówień po numerze
                    boolean czyZnaleziono = false;
                    for (Zamowieniee element : listaZamowien){
                        if (szukanyNumerZamowienia==element.pobierzNumer()){
                            Wypisz.daneOZamowieniu(element);
                            czyZnaleziono=true;
                        }
                    }
                    if (!czyZnaleziono==false){  //negacja
                        Wypisz.nieZnaleziono();
                    }
                    // TODO petla i warunek na numer zamówienia realizacja filtrowania
                    // TODO wypisz informacje [zamowienie.rachunek()]
                    break;
                case LISTA_ZAMOWIEN:
                    System.out.println("Tu będzie lista zamówień...1");
                    // TODO wypisz liste zamówień
                    // TODO użyć pętli do wyświetlenia listy
                    // for( zamowienie: listaZamowien )
                    //       zamowienie.pobierzNumer();

                    //       zamowienie.pobierzCene();
                    //       uzywając StringBuilder
                    //       ładnie wypisać
                    menu.powrot();
                    break;
                case NIE_POPRAWNIE:
                    System.out.println("Nie poprawny wybór.\nWybierz ponownie...");
            }
        }
    }
}
