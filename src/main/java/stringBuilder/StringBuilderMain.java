package stringBuilder;

import obiekty.Firma;
import obiekty.Zamowieniee;

public class StringBuilderMain {
    public static void main(String[] args) {

        String napisCudzyslow = "";
        String napisZKonstruktora = new String("");
        String napisNull = null;
        String napisBezInicjalizacji;
        String napis = "Liczba %d \n";
        System.out.println(napis);
        System.out.printf(napis,12);
        System.out.println("Napis");
        System.out.println(napisZKonstruktora);
        System.out.println(napisNull);
//        System.out.println(napisBezInicjalizacji);


        //przykład rachunku
        //nie używamy "Firma X" + "adres" + zamowienie1
        StringBuilder builer = new StringBuilder();
        Firma firma = new Firma();
        builer.append(firma.pobierzDane());

        Zamowieniee zamowienie1 = new Zamowieniee(1);
        builer.append("Cena zamówienia");
        builer.append(zamowienie1.pobierzCena());


        System.out.println(builer);

        float cena = 23.1281232f;// dopisujemy f aby
        // odróżnić f-float od d-double
        System.out.printf("\nCena :%f zł\n",cena);
        // formatowanie kwoty
        System.out.printf("\nCena :%.2f zł\n",cena);

        int numer = 123;
        /**
         * \n enter
         * \t tabulator wcięcie
         */
        System.out.printf("\nZamowienie %d\n\tkwota: %.2f",numer,cena);


    }
}
