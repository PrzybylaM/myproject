package abstrakcje;

public class Main {
    public static void main(String[] args) {

        Figura figuraKwadrat = new Kwardrat(5);
        Figura figuraTrojkat = new Trojkat(5,3,4);
        Figura figuraKolo= new Kolo(5);

        //varargs
        dodajFiguryDoListy(figuraKwadrat,figuraTrojkat,figuraKolo);

//        float sumaPol = 0;
//        for (Figura figura : listaFigur){
//            figura.wypiszDane();
//            sumaPol += figura.obliczPole();
//        }

        //TODO utwórz pozostałe figury i wypisz dane o nich
        //wykorzystując klasę abstrakcyjną
        //dodaj pola i obwody wszystkich figur
        //wykorzystaj listy i pętle
        //
        //dodatkowo: wykorzystaj varargs
        //           i oblicz sume obwodów

    }

    private static void dodajFiguryDoListy(Figura... tablicaFigur) {
        // jednoczesnie ,dodać wypisać i obliczyć pole
        float sumaPol = 0;
        for(Figura figura : tablicaFigur){
            // dodać do listy figur
            //listaFigur.add(figura);
            // wypisać
            figura.wypiszDane();
            // oblicz pole
            sumaPol+= figura.obliczPole();
        }
        System.out.printf("Suma pól to %.2f",sumaPol);
    }
}

