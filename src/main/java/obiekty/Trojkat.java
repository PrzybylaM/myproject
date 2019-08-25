package obiekty;

/**
 * Trojkat
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 24.03.2019 11:49
 **/
public class Trojkat {
    // zalozenia trojkat prostokatny - nie sprawdzamy warunku trojkata
    int wysokosc;
    int podstawa;
    int bok;

    // odpowiednie pola


    // konstruktor
    public Trojkat(int a, int b, int h){
        wysokosc = h;
        podstawa = a;
        bok = b;
    }

    // metody:
    // * oblicz pole,  * - mnożenie   + - dodawanie
        public double obliczPole(){
            return 0.5*podstawa+wysokosc;
        }
    // * oblicz obwod
    public int obliczObwod(){
            return podstawa+wysokosc+bok;
        }

    // * wypiszInfo() - informacje o trojkacie wszystkich

        public void wypiszInfo(){
            System.out.println("Wysokość: " + wysokosc + " Podstawa: "+ podstawa + " bok: " + bok);
        }
}