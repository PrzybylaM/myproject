package pl.sdacademy.java16poz.programowanie2.pizzeria;

public abstract class Pizza implements IDish {
    private int price = 0;
    private int weight = 0;


    public int getPrice(){
        return price;
    }

    public int getWeight(){
        return weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract boolean isPrzypalona();
}
