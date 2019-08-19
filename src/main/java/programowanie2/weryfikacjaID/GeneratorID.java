package pl.sdacademy.java16poz.programowanie2.weryfikacjaID;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GeneratorID {
    public String generateId() {
        List<Integer> listOfIdElement = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            listOfIdElement.add(random.nextInt(26) + 10);
        }
        for (int i = 0; i < 6; i++) {
            listOfIdElement.add(random.nextInt(10));
        }
        int result = getResult(listOfIdElement);
        if (result == 0) {
            return convertToCorrectString(listOfIdElement);
        } else {
            int newLastElement = listOfIdElement.get(6) - result;
            if (newLastElement < 0) {
                newLastElement += 10;
            }
            listOfIdElement.add(6,newLastElement);

            return convertToCorrectString(listOfIdElement);
        }
    }

    private String convertToCorrectString(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        VerificationID checker = new VerificationID();
        for (int i = 0; i < 3; i++) {
            for (Map.Entry<String, Integer> entry : checker.map.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (value.equals(list.get(i))) {
                    result.append(key);
                }
            }
        }
        for (int i = 3; i < 9; i++) {
            result.append(list.get(i));
        }
        return result.toString();
    }


    public int getResult(List<Integer> listOfIdElement) {
        int result = 0;
        for (int element : listOfIdElement) {
            result = element;
        }
        result = result % 10;
        return result;
    }
}
