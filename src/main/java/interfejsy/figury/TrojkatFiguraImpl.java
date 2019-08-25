package interfejsy.figury;

public class TrojkatFiguraImpl implements Figura {

    //odpowiednie pola dla trójkata
    int wysokosc;
    int podstawa;
    int bok;

    //konstruktor;
    public TrojkatFiguraImpl(){
        wysokosc = 3;
        bok = 5;
        podstawa = 4;
    }

    public TrojkatFiguraImpl(int wysokosc, int bok, int podstawa){
        this.bok = bok;
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }


    @Override
    public float obliczPole() {
        return podstawa*wysokosc/2;
    }

    @Override
    public float obliczObwod() {
        return podstawa*wysokosc*bok;
    }

    @Override
    public void wypiszDane() {
        System.out.println("***Trójkąt");
        System.out.println("* bok = "+bok);
        System.out.println("* wysokosc = "+wysokosc);
        System.out.println("* podstawa = "+podstawa);
        System.out.println("* pole = "+obliczPole());
        System.out.println("* obwod = "+obliczObwod());

    }
}
