package pl.sdacademy.java16poz.java16poz.animals;


import dziedziczenie.animals.Plant;
import dziedziczenie.animals.Prey;
import dziedziczenie.animals.Vegenarian;

/**
 * Squirrel
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 07.04.2019 11:04
 **/
public class Squirrel extends Mammal implements Vegenarian, Prey {

    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n %s je %s",this.getName(), plant.getName());
    }


    @Override
    public void runAWayFrom(dziedziczenie.animals.Animal animal) {

    }
}
