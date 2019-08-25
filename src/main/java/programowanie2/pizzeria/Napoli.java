package programowanie2.pizzeria;

public class Napoli extends Pizza {

    Napoli(int price, int weight){
        super.setPrice(price);
        super.setWeight(weight);
    }


    @Override
    public String description() {
        return "Pizza Napoli";
    }

    @Override
    public boolean isPrzypalona() {
        return false;
    }
}
