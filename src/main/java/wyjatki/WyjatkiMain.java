package wyjatki;

import java.util.concurrent.TimeUnit;

/**
 * WyjatkiMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 14.04.2019 11:10
 **/

public class WyjatkiMain {

    public static void main(String[] args) {
        /**
         * TODO Zadanie wyjątki
         * Stworzenie metod zrzucających wyjątki
         * TimeUnit wykorzystaj enum
         * * pobierzSekundy(int minuty,TimeUnit unit)
         * * pobierzSekundy(int dni,TimeUnit unit)
         * w main wywołanie metod
         * złapanie wyjątków,
         * wyświetlenie odpowiedniego komunikatu o zainstniałym wyjątku
         */

        int sekundy = pobierzSekundy(5,TimeUnit.DAYS);
        System.out.println(sekundy);

        int sekundy2 = 0;
        try
        {
            sekundy2 = pobierzSekundy(2,TimeUnit.HOURS);
        }catch (IllegalArgumentException e){
            System.out.println("Wyjątek:"+e.getMessage());
        }
        System.out.println(sekundy2);

    }


    public static int pobierzSekundy(int ilosc, TimeUnit unit){
            if(ilosc<0){
                throw new IllegalArgumentException(unit.name()+" > 0");
            }
        if(unit.equals(TimeUnit.DAYS) && ilosc > 30){
            throw new IllegalArgumentException(unit.name()+ " < 24");
        }
            if(unit.equals(TimeUnit.HOURS) && ilosc > 24){
                throw new IllegalArgumentException(unit.name()+ " < 24");
            }
            if (unit.equals(TimeUnit.MINUTES) && ilosc >60 || unit.equals(TimeUnit.SECONDS) && ilosc >60){
                throw new IllegalArgumentException(unit.name()+" < 60");
            }

        int result = 0;
        switch (unit){
            case DAYS:
                result = ilosc+60*60*24;
                break;
            case HOURS:
                result = ilosc*60*60;
                break;
            case MINUTES:
                result = ilosc*60;
                break;

                default:
                    return -1;

        }

        return result;// oznacza błędne obliczenie
    }


}
