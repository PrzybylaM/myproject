package pl.sdacademy.java16poz.abstrakcje;

public class Trojkat extends Figura {


    public Trojkat(int a, int b, int h) {
        super("Trojkat");
        this.a = a;
        this.b = b;
        this.h = h;


    }

    @Override
    public float obliczPole() {
        return a*h/2;
    }

    @Override
    public float obliczObwod() {
        return a+b+b;
    }
}
