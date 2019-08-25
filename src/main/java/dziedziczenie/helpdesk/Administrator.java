package dziedziczenie.helpdesk;

import java.util.List;

public class Administrator extends User{

    protected Administrator() {
        super("Administrator");
        dodajUprawnienie(Uprawnienia.ALL);
    }




    @Override
    public List<Uprawnienia> pobierzUprawnienia() {
        return listaUprawnien;
    }
}
