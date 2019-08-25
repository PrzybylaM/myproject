package projektZamowienia;

public class ZamowienieMain {
    public static void main(String[] args) {

        Zamowienie Ziemniaki = new Ziemniaki();
        double ZiemniakCena = Ziemniaki.podajCene();
        double ZiemniakVAT = Ziemniaki.obliczVat();
        Ziemniaki.wypiszDane();


        Zamowienie Kurczak = new Kurczak();
        double KurczakCena = Kurczak.podajCene();
        double KurczakVAT = Kurczak.obliczVat();
        Kurczak.wypiszDane();



        System.out.println();
        System.out.println("Całość twojego zamówienia wynosi: ");

    }
}
