package dziedziczenie.animals;

public class Plant {

    String name;

    public Plant(String name){
        this.name = name;
    }

    public Plant(){
        System.out.println("\n"+getClass().getSimpleName()+" rośnie...");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
