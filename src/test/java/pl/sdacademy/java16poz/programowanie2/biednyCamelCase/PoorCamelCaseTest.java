package pl.sdacademy.java16poz.programowanie2.biednyCamelCase;

import org.junit.Test;
import programowanie2.biednyCamelCase.PoorCamelCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PoorCamelCaseTest {

    @Test
    public void transformPanTadeuszToCamelCase() {
        File file = new File("C:\\Users\\test.txt");

        List<String> wordsInBook = new ArrayList<>();

        try {
            String st;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null) {
                String[] wordsInLine = st
                        .trim()
                        .toLowerCase()
                        .replace(",", " ")
                        .replace("!", " ")
                        .replace(".", " ")
                        .split(" ");

                wordsInBook.addAll(Arrays.asList(wordsInLine));
            }
        } catch (IOException e) {
            System.out.println("Problem z odczytywaniem z pliku");
            e.printStackTrace();
        }

        PoorCamelCase poorCamelCase = new PoorCamelCase();

        poorCamelCase.TransformPanTadeuszToCamelCase(wordsInBook);
    }

}