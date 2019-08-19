package pl.sdacademy.java16poz.testowanietdd.introduction;

public class Cafe {

    /**
     * Cafe
     * obiekt posiada stan:
     * zaserwowana
     * nie zaserwowana
     */

    boolean isServe;

    /**
     * Wartosc poczatkowa isServe = false
     */

    public Cafe(){
        isServe = false;
    }

    public void serveCoffee() {
        isServe = true;
    }


    public boolean canServeCoffee() {
        return isServe;
    }


}
