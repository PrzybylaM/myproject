package programowanie2.sklepInternetowy;

public class TaxDe implements Tax{
    public double count(double taxAmount) {
        return 0.40 * taxAmount;
    }
}
