package operatory;

/**
 * LiczbyMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 12:11
 **/
public class LiczbyMain {
    public static void main(String[] args) {
        /**
         * Zadanie stwórz klasę liczba
         * posiada konstruktor z argumentem double
         * posiada konstruktor z argumentem int
         * posiada konstruktor z argumentem float
         * pole wartosc jest double
         * posiada metody:
         * * jest parzysta
         * * jest nieparzysta
         * * pierwiastek() zwraca pierwiastek
         * * doKwadratu() zwraca do kwadratu
         * * doPotegi(int potega) podnosi i zwraca potege
         * * dodaj(Liczba a) dodaje i zwraca liczbę
         * * odejmij(Liczba a) odejmuje i zwraca liczbę
         * * wartosc() zwraca wartość int
         * * toString() zwraca liczbe jako napis
         */

        Liczba a = new Liczba(3);
        Liczba b = new Liczba(5);
        boolean czyJestParzysta = a.jestParzysta();
        System.out.printf("Czy liczba %s jest parzysta? odp: %b\n",a, czyJestParzysta);

        boolean nieJestParzysta = a.jestNieParzysta();
        System.out.printf("Czy liczba %s jest nie parzysta? odp: %b\n",b, nieJestParzysta);

        Liczba p = new Liczba(144);
        System.out.printf("Pierwiastek liczby %s wynosi: %s\n",p,p.pierwiastek());

        Liczba k = new Liczba(6);
        System.out.printf("Liczba %s podniosiona do kwadratu wynosi: %s\n", k, k.doKwadratu());

        Liczba z = new Liczba(9);
        int potega = 3;
        System.out.printf("Liczba %s podniesiona do potęgi %d wynosi: %s\n",z,potega,z.doPotegi(3));
        System.out.printf("Liczba %s podniesiona do potęgi %d wynosi: %s\n",z,potega,z.doPotegi(potega));

//    Liczba c = a.dodaj(b); // 8
        Liczba liczbaO = new Liczba(5);
        Liczba liczbaU = new Liczba(2);
        Liczba wynik = liczbaO.dodaj(liczbaU);
        System.out.printf("Liczba %s dodana do liczby %s wynosi: %s\n", liczbaO,liczbaU,wynik);

        //odejmowanie
        System.out.printf("Liczba %s odjęta od liczby %s wynosi: %s\n", liczbaO,liczbaU,liczbaU.odejmij(liczbaO));


        Liczba liczbaPrzecinkowa = new Liczba(3.234211);
        int liczbaInt = liczbaPrzecinkowa.wartoscInt();
        System.out.printf("Liczba %s kastowana do inta wynosi %d\n",liczbaPrzecinkowa,liczbaInt);

    }
}
