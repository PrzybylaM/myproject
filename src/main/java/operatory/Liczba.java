package operatory;

public class Liczba {

    double wartosc;

    public Liczba(int wartosc){
        this.wartosc = wartosc;
    }

    public Liczba(double wartosc){
        this.wartosc = wartosc;
    }

    //konstruktor float i jestParzysta
    public Liczba(float wartosc){
        this.wartosc = wartosc;
    }


    public boolean jestParzysta(){
        return wartosc%2==0;
    }


    public boolean jestNieParzysta(){
        return !jestParzysta();
    }



    public String toString(){
        return String.valueOf(wartosc); //zapisanie liczby jako tekst
    }



    //konstruktor

    public Liczba pierwiastek(){
        double pierwiastekZawartosci = Math.sqrt(wartosc);
        return new Liczba(pierwiastekZawartosci);
    }

    public Liczba doKwadratu(){
        return new Liczba(wartosc*wartosc);
    }

    public Liczba doPotegi(int wykladnik){
        double potegaZwartoscia = Math.pow(wartosc,wykladnik);
        Liczba wynik = new Liczba(potegaZwartoscia);
        return wynik;
    }

    //dodaj liczbe A , dodaje i zwraca wynik
    public Liczba dodaj(Liczba liczba){
        double wynik = wartosc + liczba.wartosc;
        return new Liczba(wynik);
    }

    public Liczba odejmij(Liczba liczba){
        return new Liczba (wartosc - liczba.wartosc);
    }

    public double wartosc(){
        return wartosc;
    }

    public int wartoscInt(){
        return (int) wartosc;
    }

    public float wartoscFloat(){
        return (float) wartosc;
    }

}
