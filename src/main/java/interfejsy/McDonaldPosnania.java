package interfejsy;

public class McDonaldPosnania implements McDonald {
    @Override
    public void poproszeFrytki(float kwota) {
        System.out.println("Brak frytek, nie ma ziemniaków");
    }

    @Override
    public void poproszeFlurry(float kwota) {
        System.out.println("Zamówienie gotowe: McFlurry");
    }
}
