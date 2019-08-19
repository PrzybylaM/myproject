package pl.sdacademy.java16poz.programowanie2.dniTygodnia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        countDay("Piatek", 25);


    }

    private static void countDay(String currentDay, int count) {

        List<String> dniTyg = new ArrayList();
        dniTyg.add("Poniedzialek");
        dniTyg.add("Wtorek");
        dniTyg.add("Sroda");
        dniTyg.add("Czwartek");
        dniTyg.add("Piatek");
        dniTyg.add("Sobota");
        dniTyg.add("Niedziela");
        dniTyg.forEach(day -> {
            if (day.equals(currentDay)) {
                int i = dniTyg.indexOf(day);
                System.out.println(dniTyg.get((count + i) % 7));
            }
        });

    }


}
