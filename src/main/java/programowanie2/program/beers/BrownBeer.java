package pl.sdacademy.java16poz.programowanie2.program.beers;

import pl.sdacademy.java16poz.programowanie2.program.helpers.IDateProvider;
import pl.sdacademy.java16poz.programowanie2.program.ILivingBear;

public class BrownBeer extends Beer implements ILivingBear {

    public BrownBeer(IDateProvider dateProvider) {
        super(dateProvider);
        setWeight(100);
        display("I am Brown Bear");
    }


    public String display() {
        return "I Am Brown Bear!";
    }

    public void attack(){
        System.out.println("Rani swoją ofiarę");
    }

    @Override
    protected void raisePaw(){
        System.out.println("Brown Bear raise left paw");
    }

    @Override
    protected void swim() {
        System.out.println("Brown Bear swimming!");
    }

    @Override
    protected void jump() {
        System.out.println("Brown bear jump on 0,75m");
    }
}


