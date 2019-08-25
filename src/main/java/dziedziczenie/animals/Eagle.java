package dziedziczenie.animals;

public class Eagle extends Bird implements Predator {

    public Eagle(String name){
        super(name);
    }




    @Override
    public void eat(Animal animal) {
        System.out.printf("\n %s została zjedzona przez %s",animal.getName(),getClass().getSimpleName());
    }

}
