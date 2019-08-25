package programowanie2.weryfikacjaID;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

//            VerificationID id = new VerificationID();
//            List<String> list =id.getIdNumbers();
//            List<String> results = id.validateDocumentsId(list);
//            results.forEach(m -> System.out.println(m));


            FileReader file = null;
        try {
            file = new FileReader("D:\\IdeaProjects\\sda\\myproject\\src\\main\\java\\pl\\sdacademy\\java16poz\\programowanie2\\weryfikacjaID\\id.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        VerificationID checker = new VerificationID();
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String id = scanner.nextLine().trim();

            if(checker.checkid(id)){
                System.out.println(id + " is correct");
            }else{
                System.out.println(id + " is inncorrect");
            }
        }


            GeneratorID generatorId = new GeneratorID();

            System.out.println(generatorId.generateId());
    }
}
