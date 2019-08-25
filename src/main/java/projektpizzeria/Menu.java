package projektpizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public void wyswietlMenu(){
        List<String> listaMenu = new ArrayList();
        listaMenu.add("Pizza z serem - 21.99");
        listaMenu.add("Pizza z szynka - 23.50");
        listaMenu.add("Pizza z pieczarkami - 20.50");
        listaMenu.add("Pizza z kebabem - 25.00");
        listaMenu.add("Napój - 6.00");
        listaMenu.add("Piwo - 5.00");
        for (String lista : listaMenu)
            System.out.println(lista);
    }


    public void wyswietl(){
        System.out.println("----------------------");
        System.out.println("-------MC PIZZA-------");
        System.out.println("----------------------");
        System.out.println("Menu:");
        System.out.println("1. Wyświetl menu");
        System.out.println("2. Złóż zamówienie");
        System.out.println("3. Sprawdź status");
        System.out.println("4. Lista zamówień");
        System.out.println("5. Zakończ");
    }

    public OpcjaMenu pobierzWybor(){
        System.out.println("Twój wybór: ");
        Scanner skaner =new Scanner(System.in);
        int opcja = skaner.nextInt();
        switch (opcja){
            case 1:
                return OpcjaMenu.WYSWIETL_MENU;
            case 2:
                return OpcjaMenu.ZLOZ_ZAMOWIENIE;
            case 3:
                return OpcjaMenu.STAN_ZAMOWIENIA;
            case 4:
                return OpcjaMenu.LISTA_ZAMOWIEN;
            case 5:
                return OpcjaMenu.ZAKONCZ;
            default:
                return OpcjaMenu.NIE_POPRAWNIE;
        }
    }

    public void powrot(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("__________________");
        System.out.println("Aby powrócić wciśnij enter");
        skaner.nextLine();
    }





}
