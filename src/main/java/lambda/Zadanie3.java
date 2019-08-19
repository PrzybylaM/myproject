package pl.sdacademy.java16poz.lambda;

import pl.sdacademy.java16poz.obiekty.Osoba;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Zadanie3
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 11.05.2019 15:42
 **/
public class Zadanie3 {

    public static void main(String[] args) {

        /**
         * Zadanie : utwórz listę 10 obiektów Osoba. ( imie, nazwisko, wiek )
         * Wyszukaj i wypisz w z użyciem stream() w jednej linii :
         * - osoby o nazwisku Kowalski lub Kowalska
         * - pełnoletnie
         */

        Osoba julia = new Osoba("Julia", "Nowak", 18);
        Osoba pawel = new Osoba("Pawel", "Przybyla", 25);
        Osoba janusz = new Osoba("Janusz", "Kowalski", 30);

        List<Osoba> listaOsob = new ArrayList();
        listaOsob.add(julia);
        listaOsob.add(pawel);
        listaOsob.add(janusz);

        List <Osoba> listaFiltrowana = listaOsob.stream().filter(o->o.pobierzNazwisko().toLowerCase().contains("kowal")).filter(o->o.pobierzWiek()>18).collect(Collectors.toList());
        listaFiltrowana.stream().forEach(o-> System.out.println(o.toString()));

    }
}
