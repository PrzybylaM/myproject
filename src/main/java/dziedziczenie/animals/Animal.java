package pl.sdacademy.java16poz.dziedziczenie.animals;

public class Animal {

    public String getName() {
        return name;
    }

    private String name;


    public Animal(String name){
        this.name = name;
        System.out.printf("\n%s(%s) urodzil sie ",this.name,getClass().getSimpleName());
    }


    public void runAWayFrom(Animal animal) {
        if (animal==null){
            System.out.printf("%s wystrasza się i ucieka!",this.getName());
        }else
        System.out.printf("\n%s ucieka przed %s", this.getName(),animal.getName());
    }

    public void tryEat(){
        System.out.printf("\n%s chce go zjeść", this.getName());
    }

    public void ucieka(){
        System.out.printf("\n%s ucieka z ZOO");
    }
}
