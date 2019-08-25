package programowanie2.program.beers;

import programowanie2.program.Animal;
import programowanie2.program.helpers.IDateProvider;
import programowanie2.program.ILivingBear;

public abstract class Beer extends Animal implements ILivingBear {
    public Beer(IDateProvider dateProvid) {
        super(dateProvid);
    }

    public void attack(){
        System.out.println("Rani ofiarę!");
    }

    protected void raisePaw(){
        System.out.println();
    }

    protected void openMouth(){
        System.out.println("Open mouth Arrrr..!");
    }

    public void inspect(){

        raisePaw();

        openMouth();

        jump();

        swim();

    }

}
