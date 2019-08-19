package pl.sdacademy.java16poz.programowanie2.program;

import pl.sdacademy.java16poz.programowanie2.program.helpers.DateUtils;
import pl.sdacademy.java16poz.programowanie2.program.helpers.IDateProvider;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public abstract class Animal implements IAnimal {
    private Date lastEatTime;
    private int weight;
    private String msgToshow;


    private IDateProvider dateProvider;

    public Animal(IDateProvider dateProvid){

        dateProvider = dateProvid;

    }

    public boolean isAlive(){
        return lastEatTime == null
                ? false
                : TimeUnit.DAYS.convert(DateUtils.getDateDiff(dateProvider.getDate(), lastEatTime), TimeUnit.MILLISECONDS) < 10;
    }

    public void eat(){
        this.lastEatTime = dateProvider.getDate();

//        Calendar calendar = Calendar.getInstance();
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//        System.out.println(dateFormat.format(calendar.getTime()));
    }


    protected void setWeight(int newWeight){
        weight = newWeight;
    }

    public int getWeight(){
        return weight;
    }


    protected void setMsgToShow(String newMsg){
        msgToshow = newMsg;
    }

    public void display(String newShow) {
        System.out.println(msgToshow);
    }


    //public abstract String
    public abstract void attack();
    


    protected abstract void swim();

    protected abstract void jump();
    
    protected abstract void openMouth();

    protected abstract void raisePaw();


}
