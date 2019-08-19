package pl.sdacademy.java16poz.projekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {




    public void wyswietl() {
        System.out.println("======================");
        System.out.println("====== MC DONALD =====");
        System.out.println("======================");
        System.out.println("Menu:");
        System.out.println("1. Złóż zamówienie");
        System.out.println("2. Sprawdź status");
        System.out.println("3. Lista zamówień");
        System.out.println("0. Zakończ");

    }

    public OpcjaMenu pobierzWybor() {
        System.out.println("---------------------");
        System.out.println("Twój wybór: ");
        Scanner skaner = new Scanner(System.in);
        int opcja = skaner.nextInt();
        switch (opcja){
            case 1 :
                return OpcjaMenu.ZLOZ_ZAMOWIENIE;

            case 2 :
                return OpcjaMenu.SPRAWDZ_ZAMOWIENIE;

            case 0 :
                return OpcjaMenu.ZAKONCZ;

            // Dodaj 3 pozycję w menu 'Lista zamówień'
            case 3 :
                return OpcjaMenu.LISTA_ZAMOWIEN;

            default:
                return OpcjaMenu.NIE_POPRAWNIE;
        }

    }

    public void powrot() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("____________________________");
        System.out.println("Aby powrócić wciśnij [enter]");
        skaner.nextLine();
    }
}
