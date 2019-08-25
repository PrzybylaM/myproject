package programowanie2.kryptografia.szyfrCezara;

import java.util.Scanner;

public class ProgramWithMethod {
    public static void main(String[] args) {

        ICezarService cezarService = new CezarService();
        String messages;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message: ");
        messages = sc.nextLine();

        System.out.println("Enter key: ");
        int key = sc.nextInt();

        cezarService.szyfrowanie(messages, key);
        String boom = cezarService.rozszyfrowywanie(key);

        System.out.println("Wiadomość zaszyfrowana: " + cezarService.setCezar());
        System.out.println("Booom!!! " + boom);


    }

}
