package programowanie2.pizzeria;

public class Main {
    public static void main(String[] args) {


        Napoli napoli = new Napoli(22,10);
        System.out.println(napoli.description() + " " + napoli.getPrice());

        Pizza pizza1= new Margaritta(20,10);
        System.out.println(pizza1.description() + " " + pizza1.getPrice());
    }
}
