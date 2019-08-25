package dziedziczenie.helpdesk;

import java.util.List;

public class Obsluga extends User {

    protected Obsluga() {
        super("Obsługa");
        dodajUprawnienie(Uprawnienia.OBSLUGA);
    }





    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        return listaUprawnien;
    }
}
