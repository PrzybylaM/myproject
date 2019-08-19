package pl.sdacademy.java16poz.abstrakcje;

public class Prostokat extends Figura {


    public Prostokat(int a, int b) {
        super("Prostokat");
        this.a = a;
        this.b = b;
    }


    @Override
    public float obliczPole() {
        return a*b;
    }

    @Override
    public float obliczObwod() {
        return 2*(a+b);
    }
}
