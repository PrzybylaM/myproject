package pl.sdacademy.java16poz.interfejsy.figury;

public class ProstokatFiguraImpl implements Figura {

    //Dane
    int bokA;
    int bokB;


    //konstruktor
    ProstokatFiguraImpl(){
        bokA = 5;
        bokB = 4;
    }


    @Override
    public float obliczPole() {
        return bokA*bokB;
    }

    @Override
    public float obliczObwod() {
        return 2*bokA+2*bokB;
    }

    @Override
    public void wypiszDane() {
        System.out.println("** Prostokąt **");
        System.out.println("Długość boku A wynosi: "+bokA);
        System.out.println("Długość boku B wynosi: "+bokB);
        System.out.println("Pole prostokąta wynosi: "+obliczPole());
        System.out.println("Obwód prostokąta wynosi: "+obliczObwod());
    }
}
