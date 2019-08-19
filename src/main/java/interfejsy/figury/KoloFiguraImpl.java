package pl.sdacademy.java16poz.interfejsy.figury;

public class KoloFiguraImpl implements Figura{

    //wlasciwosci
    float promien;
    private float PI = ((float)Math.PI);

    //konstruktor
    public KoloFiguraImpl(){
        promien = 10;
    }


    @Override
    public float obliczPole() {
        return PI*promien*promien;
    }

    @Override
    public float obliczObwod() {
        return 2*PI*promien;
    }

    @Override
    public void wypiszDane() {
        System.out.println("***Koło***");
        System.out.println("* Pole = "+(int)obliczPole());
        System.out.println("* Obwód = "+(int)obliczObwod());
    }
}

