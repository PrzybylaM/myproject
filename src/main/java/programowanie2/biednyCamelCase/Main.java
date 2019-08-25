package programowanie2.biednyCamelCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("D:\\IdeaProjects\\sda\\myproject\\src\\main\\java\\pl\\sdacademy\\java16poz\\programowanie2\\biednyCamelCase\\nazwa.txt");
        Scanner odczyt = new Scanner(file);
        Scanner odczyt1 = new Scanner(System.in);

        String text = odczyt.nextLine();
        System.out.println(text);

        System.out.println("Podaj tekst");
        String nazwa = odczyt1.next();
    }
}
