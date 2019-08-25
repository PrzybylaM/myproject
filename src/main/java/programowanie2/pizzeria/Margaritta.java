package programowanie2.pizzeria;

public class Margaritta extends Pizza{

    private int price;
    private int weight;

    Margaritta(int price, int weight){
        super.setPrice(price);
        super.setWeight(weight);
    }


    @Override
    public String description() {
        return "Pizza Margaritta";
    }

    @Override
    public boolean isPrzypalona() {
        return false;
    }
}
