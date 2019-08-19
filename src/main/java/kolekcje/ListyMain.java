package pl.sdacademy.java16poz.kolekcje;

import pl.sdacademy.java16poz.interfejsy.figury.Figura;
import pl.sdacademy.java16poz.interfejsy.figury.KoloFiguraImpl;
import pl.sdacademy.java16poz.interfejsy.figury.TrojkatFiguraImpl;
import pl.sdacademy.java16poz.obiekty.Zamowieniee;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyMain {
    public static void main(String[] args) {

        //interfejsy
        Figura trojkatFigura = new TrojkatFiguraImpl();
        Figura koloFigura = new KoloFiguraImpl();

        //listy
        List listaPrzebojow = new ArrayList();  //domyślnie uzywamy
        List listaPrzebojow1 = new LinkedList();

        //interfejs Figura ma 2 równe implementacje
        //lista ma 2 rózne implementacje

        listaPrzebojow.add("Abba - Mamma mia");
        listaPrzebojow.add("Just5");


        //wypisanie elementów listy
        for (int i=0; i<listaPrzebojow.size(); i++){
            System.out.println(i+1+"."+listaPrzebojow.get(i));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        //wypisanie listy z uzyciem  : dwukropka
        for(Object przeboj : listaPrzebojow){
            System.out.println(przeboj);
        }

        //Zadanie
        //Stwórz listę zamowień
        //Stwórz metodę dodawania nowego zamówienia do listy
        //stwórz metodę wypisywania zamowień (for)

        //dodaj 3 zamowienia za kazdym dodaniem wypisz stan listy zamowien

        //za pomoca pętli for zrób podsumowanie zamówień wypisują
        //sumę wszystkich zamowień

        List<Zamowieniee> listaZamowienia = new ArrayList();
            //dodajac zamowienie
        dodajZamowienieDoListy(listaZamowienia, 1, 2.99f);
        wypiszListeZamowien(listaZamowienia);
        dodajZamowienieDoListy(listaZamowienia, 2, 7.99f);
        wypiszListeZamowien(listaZamowienia);
        dodajZamowienieDoListy(listaZamowienia, 3, 10.99f);
        wypiszListeZamowien(listaZamowienia);

        podsumowanieZamowien(listaZamowienia);
    }

    private static void podsumowanieZamowien(List<Zamowieniee> listaZamowien) {
        float suma = 0;

        for(Zamowieniee zamowienie: listaZamowien){
            zamowienie.pobierzCena();
        }

        for(int i=0;i<listaZamowien.size();i++ ){
            Zamowieniee zamowieniee = listaZamowien.get(i);
            zamowieniee.pobierzCena();
        }

        System.out.println("====== SUMA : "+suma);
    }

    private static void wypiszListeZamowien(List<Zamowieniee> listaZamowien) {
        System.out.println("==== Lista zamówień ===");
        for(int i=0;i<listaZamowien.size();i++ ){
            System.out.println(i+1+"."+listaZamowien.get(i));
        }
        System.out.println("-----------------------");
    }

    public static void dodajZamowienieDoListy(List listaZamowien, int numer, float cena){
        Zamowieniee zamowienie= new Zamowieniee(numer,cena);
        listaZamowien.add(zamowienie);
        System.out.println("=> dodawanie : "+zamowienie);
    }
}
