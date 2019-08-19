package pl.sdacademy.java16poz.dziedziczenie.animals;

public class Squirrel extends Mammal implements Vegenarian, Prey {


    public Squirrel(String name) {
        super(name);
    }



    @Override
    public void eat(Plant plant) {
        System.out.printf("\n %s je %s", this.getName(), plant.getName());
    }
}
