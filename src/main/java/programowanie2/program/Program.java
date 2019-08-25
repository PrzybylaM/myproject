package programowanie2.program;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import programowanie2.program.beers.*;
import programowanie2.program.helpers.DateProvider;
import programowanie2.program.helpers.IDateProvider;
import programowanie2.program.service.AnimalsService;
import programowanie2.program.service.IAnimalService;

import java.util.Map;
import java.util.Scanner;

public class Program {

    private static final Logger log = LoggerFactory.getLogger(Program.class);

    public static void main(String []args) {

        log.debug("Logger is working!!");


        System.out.println("-- Zoo application --");
        System.out.println("any input - runs example logic");
        System.out.println("[quit|exit] - exits from application");

        while(true){
            try{

                if (true){
                   // throw new RuntimeException(); - zrzuca błąd
                }

                //BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 8192 chars possible per line and is thread-safe
                //String input = in.readLine();

                System.out.println("Type in command: ");

                Scanner in = new Scanner(System.in); // 1024 chars possible per line and is not thread-safe
                String input = in.next();

                if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")){
                    System.exit(0);
                }

                IDateProvider provider = new DateProvider();

                Beer bear = new BlackBeer(provider);
                bear.eat();

                boolean isAlive = bear.isAlive();

                IToyBear bear2 = new TeddyBeer();
                ILivingBear bear3 = new PolarBeer(provider);

                bear3.isAlive();

                bear3.getWeight();
                bear3.display();
                bear3.attack();

                bear.inspect();

                System.out.println();

                IAnimalService animalService = new AnimalsService();
                animalService.addAnimal(bear);
                animalService.addAnimal(bear3);
                animalService.addAnimal(bear3);
                animalService.addAnimal(bear3);
                animalService.addAnimal(bear);

                Integer allAnimalsCount = animalService.getNumberOfAnimals();
                Map<String, Integer> animalsCount = animalService.getAnimalsCount();
                System.out.println(allAnimalsCount);
                System.out.println(animalsCount);
            }
            catch(Exception ex){
                log.error("Error has occured: ", ex);
                System.exit(-1);
            }
        }
    }
}
