package klasy;

import obiekty.Hotel;

public class hotelMain {
    public static void main(String[] args) {

        String nazwa = "Astra";
        String adres = "Ul.Długa";
        int kodPocztowy = 61000;
        String miasto = "Poznań";

        Hotel astraHotel = new Hotel ("Astra");
        astraHotel.ustawAdres(adres);
        astraHotel.ustawKodPocztowy(kodPocztowy);
        astraHotel.ustawMiasto(miasto);
        System.out.println(astraHotel.pobierzDane());
    }
}
