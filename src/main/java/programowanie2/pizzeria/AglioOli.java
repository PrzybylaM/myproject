package pl.sdacademy.java16poz.programowanie2.pizzeria;

public class AglioOli extends Pasta {
    private int price;
    private int weight;

    AglioOli(int price, int weight){
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String description() {
        return "Pyszny sos agliooli";
    }
}
