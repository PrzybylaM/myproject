package programowanie2.watki;

import programowanie1.sort.BubbleSort;

import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<int[]> {
    private int id;
    private List<Integer>myPart;

    public MyCallable(int id, List<Integer>myPart){
        this.id = id;
        this.myPart = myPart;
    }


    @Override
    public int[] call(){
        System.out.println("Thread no. " + id + "is counting.");
        //return bubbleSort(myPart);
        return null;
    }
}
