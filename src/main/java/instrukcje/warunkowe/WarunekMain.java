package pl.sdacademy.java16poz.instrukcje.warunkowe;


public class WarunekMain {


    public static boolean jestPomiedzy(int wartosc,int min, int max){
        return wartosc<=max && wartosc>min;
    }

    public static void main(String[] args) {

        //wartosc wiek
        //w zaleznosci od wieku
        //0-12 podstawowka
        //12-18 liceum
        //18-25 studia
        //25-50 doktorat
       // Uagi użyj na <m <=, >=, >
        //użyj else, if, else if

        double wiek = 2;
        if (wiek > 0 && wiek <= 12) {
            System.out.println("Podstawowka");
        }else if (wiek >= 12 && wiek <= 18) {
            System.out.println("Liceum");
        }else if (wiek >= 18 && wiek <= 25) {
            System.out.println("Studia");
        }else if(wiek >= 25 && wiek <= 50) {
            System.out.println("Doktorat");
        }else {
            System.out.println("Jest pełnoletni!");
        }


        int godzina = 8;

        if(godzina>24 || godzina<0){
            System.out.println("Nie prawidłowa godzina");
        }else if(godzina==13){
            System.out.println("Przerwa obiadowa");
        }else if(godzina>9 && godzina<16){
            System.out.println("Zajęcia");
        }else{
            System.out.println("Czas poza zajęciami");
        }

    }
}
