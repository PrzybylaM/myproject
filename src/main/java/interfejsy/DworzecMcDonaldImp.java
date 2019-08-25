package interfejsy;

public class DworzecMcDonaldImp implements McDonald {

    /*
        Zadanie: Utwórz implementację mcdonald z C.H. Posnania
        frytek nie ma bo skończyły się ziemniaki

     */

    @Override
    public void poproszeFrytki(float kwota) {
        System.out.println("Zamówienie gotowe: Frytki");
    }

    @Override
    public void poproszeFlurry(float kwota) {
        System.out.println("Zamówienie gotowe: McFlurry");

    }
}
