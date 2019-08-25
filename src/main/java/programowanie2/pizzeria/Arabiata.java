package programowanie2.pizzeria;

public class Arabiata extends Pasta {
    private int price;
    private int weight;

    Arabiata(int price, int weight){
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String description() {
        return "Pyszny sos arabiata";
    }
}
