package pl.sdacademy.java16poz.projektZamowienia;

public class Ziemniaki implements Zamowienie  {

    //Podajemy dane za kg ziemniaków
    double cenaKg;
    double VAT;
    int ilosc;

    //konstruktor
    Ziemniaki(){
        cenaKg = 2.4;
        VAT = 0.09F;
        ilosc = 5;
    }


    @Override
    public double podajCene() {
        return ilosc*cenaKg;
    }

    @Override
    public double obliczVat() {
        return podajCene()+(podajCene()*VAT);
    }

    @Override
    public void wypiszDane() {
        System.out.println("** Ziemniaki **");
        System.out.println("Cena za KG ziemniaków: "+ podajCene());
        System.out.println("Ziemniaki z VATEM kosztują: "+obliczVat());
    }
}
