package dziedziczenie.helpdesk;


public class HelpDeskMain {
    public static void main(String[] args) {
        /**
         * Utwórz klase abstrakcyjna User tak by metoda
         * przedstawSie zalezala od tego kim jestesmy.
         * Administrator->User, Obsluga -> User, Klient -> User
         * Klasa abstrakcyjna zawiera metode abstrakcyjna:
         * - List<Uprawnienia> pobierzUprawnienia()
         * -enum Uprawnienia
         *
         * Administrator:
         * ALL
         * User:
         * USER
         * Klient:
         * KLIENT
         */

            Administrator admin = new Administrator();
            admin.przedstawSie();
            Obsluga obsluga = new Obsluga();
            obsluga.przedstawSie();
            Klient klient = new Klient();
            klient.przedstawSie();


    }
}
