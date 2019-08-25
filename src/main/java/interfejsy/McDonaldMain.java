package interfejsy;

/**
 * McDonaldMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 13:17
 **/
public class McDonaldMain {

    public static void main(String[] args) {

        McDonald dworzecMcDonald = new DworzecMcDonaldImp();

        // utworzenie implementacji z CH Posnania
        McDonald McDonaldPosnania = new McDonaldPosnania();

        // wywołanie dostępnych metod
        dworzecMcDonald.poproszeFrytki(10);
        dworzecMcDonald.poproszeFlurry(10);

        McDonaldPosnania.poproszeFrytki(10);
        McDonaldPosnania.poproszeFlurry(10);


    }
}
