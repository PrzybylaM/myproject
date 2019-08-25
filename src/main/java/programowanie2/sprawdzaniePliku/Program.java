package programowanie2.sprawdzaniePliku;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in2 = new Scanner(System.in);
        System.out.println("Type in path:");
        String path = in2.nextLine();
        File file = new File(path);
        if (file.isDirectory()){
            for (File nazwa : file.listFiles()){
                System.out.println(nazwa);
                }
        } else if (file.isFile()){
            long fileSize = file.length(); // gets file size in Bytes (B)
            System.out.println(fileSize);
        }

        File[] filesInDirectory = file.listFiles();
    }
}
