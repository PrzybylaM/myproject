package pl.sdacademy.java16poz.dziedziczenie.helpdesk;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    protected String nazwa;

    //pola
    protected List<Uprawnienia> listaUprawnien;

    //Konstruktory
    protected User(String nazwa){
        this.nazwa = nazwa;
        listaUprawnien = new ArrayList();
    }


    void dodajUprawnienie(Uprawnienia uprawneinie){
        listaUprawnien.add(uprawneinie);
    }

    protected void przedstawSie(){
        System.out.println(nazwa);
    }

    //metody
    public abstract List<Uprawnienia> pobierzUprawnienia();

}
