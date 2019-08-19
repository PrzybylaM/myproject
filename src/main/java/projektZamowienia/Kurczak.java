package pl.sdacademy.java16poz.projektZamowienia;

public class Kurczak implements Zamowienie {

    //Dane
    double cenaZaKG;
    double VAT;
    int ilosc;

    //Konstruktor
    Kurczak(){
        this.cenaZaKG = 12.99;
        VAT = 0.09F;
        ilosc = 3;
    }

    @Override
    public double podajCene() {
        return ilosc*cenaZaKG;
    }

    @Override
    public double obliczVat() {
        return (podajCene()+(podajCene()*VAT));
    }

    @Override
    public void wypiszDane() {
        System.out.println("** Kurczak **");
        System.out.println("Cena za Kg kurczaka wynosi:"+podajCene()+" netto");
        System.out.println("Cena za Kg kurczaka z VAT wynosi: "+obliczVat());
    }
}
