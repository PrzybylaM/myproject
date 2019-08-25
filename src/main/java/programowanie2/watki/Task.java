package programowanie2.watki;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Task implements Runnable {
    private int id;


    public void run() {
//        System.out.println("Current thread id is " + id);
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<String> pesels = new ArrayList<>();
        String pesel = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\admin\\Desktop\\pesele.txt"));
            for (int i = 0; i<1000;i++){
                pesel = br.readLine();
                pesels.add(pesel);
            }
            countPeselCheckSum(pesels);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void countPeselCheckSum(List<String> pesels) {
        pesels.forEach(pes ->{
            int first = (int)pes.charAt(0);
            int second = (int)pes.charAt(1);
            int third = (int)pes.charAt(2);
            int fourth = (int)pes.charAt(3);
            int fivth = (int)pes.charAt(4);
            int sixth = (int)pes.charAt(5);
            int seventh = (int)pes.charAt(6);
            int eighth = (int)pes.charAt(7);
            int nineth = (int)pes.charAt(8);
            int tenth = (int)pes.charAt(9);
            int eleventh = (int)pes.charAt(10);

            int result = first*1+second*3+third*7+fourth*9+fivth*1+sixth*3+seventh*7+eighth*9+nineth*1+tenth*3+eleventh*1;
            int lastNumber = result % 10;
            if (lastNumber == 0){
                //System.out.println("Pesel " + pes + " jest OK!");
            }else{
                System.out.println("Błędny pesel");
            }
        try {
            sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        });
    }
}

