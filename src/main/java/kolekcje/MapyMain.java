package pl.sdacademy.java16poz.kolekcje;

import pl.sdacademy.java16poz.obiekty.Zamowieniee;
import pl.sdacademy.java16poz.projektZamowienia.Zamowienie;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapyMain {
    public static void main(String[] args) {
        List<Zamowieniee> listaZamowien = new ArrayList();
        Zamowieniee zamowienie1 = new Zamowieniee(1,12);
        Zamowieniee zamowienie2 = new Zamowieniee(2,10);
        Zamowieniee zamowienie3 = new Zamowieniee(3,15);
        listaZamowien.add(zamowienie1);
        listaZamowien.add(zamowienie3);
        listaZamowien.add(zamowienie3);
        Map<Integer,Zamowieniee> mapaZamowien = new HashMap<Integer, Zamowieniee>();
        mapaZamowien.put(1, zamowienie1);
        mapaZamowien.put(2, zamowienie2);
        mapaZamowien.put(3, zamowienie3);

        boolean czyIstniejeZamowienie1 = mapaZamowien.containsKey(1);

        for (Zamowieniee zamowienie : mapaZamowien.values()){
            System.out.println(zamowienie);
        }
        for (Map.Entry<Integer, Zamowieniee> element : mapaZamowien.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

        //pobieranie = mapy
        Zamowieniee zamowieniezMapy = mapaZamowien.get(1);

    }
}
