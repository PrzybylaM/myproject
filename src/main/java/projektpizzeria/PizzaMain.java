package projektpizzeria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {


        List<Zamowienie> listaZamowien = new ArrayList<>();

        Menu menu = new Menu();
        boolean truee = true;
        while(truee) {
            menu.wyswietl();
            OpcjaMenu opcja = menu.pobierzWybor();

            switch (opcja) {
                case WYSWIETL_MENU:
                    menu.wyswietlMenu();
                    break;
                case ZLOZ_ZAMOWIENIE:
                    int numer = listaZamowien.size() + 1;
                    Zamowienie zamowienie = new Zamowienie(numer);
                    Scanner skaner = new Scanner(System.in);
                    System.out.println("Podaj nazwę pozycji:");
                    String nazwa = skaner.nextLine();
                    System.out.println("Podaj cene pozycji");
                    boolean czyPrawidlowaKwota = false;
                    float cena = 0;
                    while (!czyPrawidlowaKwota) {
                        try {
                            Scanner skanerKwota = new Scanner(System.in);
                            cena = skanerKwota.nextFloat();
                            czyPrawidlowaKwota = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Nie prawidłowa kwota użyj przecinka");
                        }
                    }
                    //dodawanie pozycji do zamowienia
                    zamowienie.dodajPozycje(nazwa, cena);
                    //dodanie zamowienia do listy zamowien
                    listaZamowien.add(zamowienie);
                    break;
                case STAN_ZAMOWIENIA:
                    // TODO wprowadź numer skanerem z klawiatury
                    int ZamowienieNumer = listaZamowien.size() +1;
                    Scanner skaner1 = new Scanner(System.in);
                    System.out.println("Proszę podać numer zamówienia");
                    int number = skaner1.nextInt();
                    for (Zamowienie lista : listaZamowien){
                        lista.ZamowienieWyswietl();
                    }
                    // TODO filtrowanie listy zamówień po numerze
                    // TODO petla i warunek na numer zamówienia realizacja filtrowania
                    // TODO wypisz informacje [zamowienie.rachunek()]
                    break;
                case LISTA_ZAMOWIEN:
                    System.out.println("@@ Lista zamówień @@");
                    for (Zamowienie zamowienieElement : listaZamowien) {
                        int numerZamowienia = zamowienieElement.pobierzNumer();
                        System.out.println("Zamówienie nr. " + numerZamowienia);

                        List<PozycjaZamowienia1> listaPozycji = zamowienieElement.pobierzPozycje();
                        for (PozycjaZamowienia1 pozycja : listaPozycji) {
                            pozycja.prettyPrint();
                        }
                    }
                    menu.powrot();
                    break;
                case ZAKONCZ:
                        System.out.println("Dziękujemy i zapraszamy ponownie! ;) ");
                        truee= false;
                        break;
                case NIE_POPRAWNIE:
                    System.out.println("Nie poprawny wybór.\nWybierz ponownie...");
                    break;
            }
        }




    }

}
