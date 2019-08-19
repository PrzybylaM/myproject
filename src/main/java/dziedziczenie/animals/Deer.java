package pl.sdacademy.java16poz.dziedziczenie.animals;

public class Deer extends Mammal implements Vegenarian {

    public Deer(String name) {
        super(name);
    }



    @Override
    public void eat(Plant plant) {
        System.out.printf("\n%s je trawe...nagle!",this.getName());
    }
}

