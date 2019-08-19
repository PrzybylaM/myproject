package pl.sdacademy.java16poz.programowanie2.program.beers;

import pl.sdacademy.java16poz.programowanie2.program.helpers.IDateProvider;
import pl.sdacademy.java16poz.programowanie2.program.ILivingBear;

public class PolarBeer extends Beer implements ILivingBear {

    String name;

    public PolarBeer(IDateProvider dateProvider){
        super(dateProvider);
        setWeight(200);
        display("I am Polar Bear");
    }


    public String display() {
        return "I am Polar Bear!";
    }

    public void attack(){
        System.out.println("Kill the target!");
    }

    @Override
    protected void raisePaw(){
        System.out.println("Polar Bear raise right paw");
    }

    @Override
    protected void swim() {
        System.out.println("Polar Bear swimming");
    }

    @Override
    protected void jump() {
        System.out.println("Polar Bear jump on 1m");
    }
}
