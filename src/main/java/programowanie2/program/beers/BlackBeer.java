package programowanie2.program.beers;

import programowanie2.program.helpers.IDateProvider;
import programowanie2.program.ILivingBear;

public class BlackBeer extends Beer implements ILivingBear {


    public BlackBeer(IDateProvider dateProvider){
        super(dateProvider);
        setWeight(50);
        display("I am Black Bear");
    }


    public String display() {
        return "I am Black Bear!";
    }

    public void attack(){
        System.out.println("Rani swoją ofiarę");
    }

    @Override
    protected void raisePaw(){
        System.out.println("Black Bear raise left paw");
    }

    @Override
    protected void swim() {
        System.out.println("Black bear fear the water");
    }

    @Override
    protected void jump() {
        System.out.println("Black bear jump on 0,5m");
    }


}
