package pl.sdacademy.java16poz.programowanie2.sklepInternetowy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaxOffice taxOffice = new TaxOffice();

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj kwotę do obliczenia");
        int num = scan.nextInt();

        TaxPL tax = new TaxPL();
        tax.count(num);
        System.out.println("Podatek Polski whynosi: ");
        taxOffice.setTax(new TaxPL());
        System.out.println(taxOffice.performAction(num));
    }


}
