package interfejsy.figury;


public class KwadratFiguraImpl implements Figura {

    //Pola dla kwadratu
    int bok;

    //konstruktor
    KwadratFiguraImpl(){
        this.bok = 5;
    }


    @Override
    public float obliczPole() {
        return bok*bok;
    }

    @Override
    public float obliczObwod() {
        return 4*bok;
    }

    @Override
    public void wypiszDane() {
        System.out.println("**Kwadrat**");
        System.out.println("Długość boku wynosi: "+bok);
        System.out.println("Pole jest równe: "+obliczPole());
        System.out.println("Obwód wynosi: "+obliczObwod());
    }
}
