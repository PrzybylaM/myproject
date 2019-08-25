package instrukcje.warunkowe.instrukcje.przelacznik;


import typNumeryczny.StatusUzytkownika;

public class StatusSwitchMain {
    public static void main(String[] args) {
        /**
         * Zadanie:
         * Wykorzystując typ wyliczeniowy – enum  Status ( uzytkownika)
         * i switch utwórz metodę wypisująca komunikat w zależności od statusu.
         * DOSTEPNY,NIEDOSTEPNY,NIEAKTYWNY
         */

        StatusUzytkownika mojStatus = StatusUzytkownika.NIE_AKTYWNY;

        
        wypiszStatus(mojStatus);
        
        //wypiszStatus(mojStatus)

        //ale dlaczego zrobiłeś to switchem?
        System.out.println(mojStatus.toString().toLowerCase());


        }

    private static void wypiszStatus(StatusUzytkownika mojStatus) {
        switch (mojStatus){
            case AKTYWNY:
                System.out.println("Brawo");
                break;
            default: case NIE_AKTYWNY:
                System.out.println("Przykro mi");
                break;
        }
    }
}




