package interfejsy.figury;


public class FiguryMain {


    public static void witaj() {
        System.out.println("---Figury---");
    }


    public static void main(String[] args) {

        /*interfejs: Figura
            metoda: float obliczPole()
            metoda: float obliczObwod()
            metoda: void wypiszDane() - pretty print, przyjazne dla użytkownika


         klasy: (implementować interfejs Figura)
         trójkat  FiguraImpl
         kwadrat
         koło
         prostokat

         Klasy zawięrają odpowiednie pola - wymagane do metod

         Main:
         Tworzenie wszystkich figur. Wypisanie pol i obwodow

         Dodatkowo: suma pol i obwodow
         */

        witaj(); // metoda zaimplementowana na początku


        Figura trojkatFiguraa = new TrojkatFiguraImpl();
        float poletrojkata = trojkatFiguraa.obliczPole();

        Figura trojkatFigura = new TrojkatFiguraImpl();
        float obwodTrojkata = trojkatFigura.obliczObwod();
        trojkatFigura.wypiszDane();

        Figura trojkatPole2 = new TrojkatFiguraImpl(10,2,5);
        float poletrojkata2 = trojkatPole2.obliczPole();

        Figura trojkatFigura2 = new TrojkatFiguraImpl(10,2,5);
        float obwodTrojkata2 = trojkatFigura.obliczObwod();
        trojkatFigura2.wypiszDane();

        Figura koloPole = new KoloFiguraImpl();
        float poleKolo = koloPole.obliczPole();

        Figura koloObwod = new KoloFiguraImpl();
        float obliczObwod = koloObwod.obliczObwod();
        koloObwod.wypiszDane();

        Figura kwadrat = new KwadratFiguraImpl();
        float kwadratPole = kwadrat.obliczPole();
        float obwodPole = kwadrat.obliczObwod();
        kwadrat.wypiszDane();

        Figura prostokat = new ProstokatFiguraImpl();
        float prostokatP = prostokat.obliczPole();
        float prostokatO = prostokat.obliczObwod();
        prostokat.wypiszDane();


    }
}
