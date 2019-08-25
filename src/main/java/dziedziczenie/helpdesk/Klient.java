package dziedziczenie.helpdesk;

import dziedziczenie.helpdesk.User;

import java.util.ArrayList;
import java.util.List;

public class Klient extends User {

    public Klient(){
        super("Klient");
        dodajUprawnienie(Uprawnienia.KLIENT);
    }


    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        List<Uprawnienia> listaUprawnien = new ArrayList();
        return listaUprawnien;


    }
}
