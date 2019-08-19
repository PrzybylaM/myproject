package pl.sdacademy.java16poz.abstrakcje;


public class Kolo extends Figura {
    public Kolo(int promien) {
        super("Kolo");
        this.r = promien;

    }

    float PI = 3.14f;

    @Override
    public float obliczPole() {
        return PI*r*r;
    }

    @Override
    public float obliczObwod() {
        return 2*PI*r;
    }
}
