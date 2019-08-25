package projekt;

public class MenuMain {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.wyswietl();
        OpcjaMenu opcja = menu.pobierzWybor();

        switch (opcja){
            case ZAKONCZ:
                System.out.println("Do widzenia");
                break;
            case STAN_ZAMOWIENIA:
                System.out.println("Nie zaimplementowane");
                break;
            case NIE_POPRAWNIE:
                System.out.println("Wybierz ponownie...");
        }
    }
}

