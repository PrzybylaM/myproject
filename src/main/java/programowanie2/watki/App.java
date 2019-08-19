package pl.sdacademy.java16poz.programowanie2.watki;


import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

while (true) {
    System.out.println("Witaj, wciśnij 1 aby zwalidować pesele, wybierz 2, żeby wyświtlić rymowanke, wybierz 3 aby zakonczyc!");

    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();

    switch (input) {
        case 1: {
            Runnable runner = new Task();
            new Thread(runner).start();
            break;
        }
        case 2: {
            System.out.println("Zające kicają sobie na łące");
            break;
        }
        case 3: {
            System.exit(200);
        }
    }
}








    }
}
