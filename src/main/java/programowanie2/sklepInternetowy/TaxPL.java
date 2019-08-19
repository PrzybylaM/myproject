package pl.sdacademy.java16poz.programowanie2.sklepInternetowy;

public class TaxPL implements Tax {
    public double count(double taxAmount){
        return 0.23 * taxAmount;
    }
}
