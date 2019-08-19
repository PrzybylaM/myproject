package pl.sdacademy.java16poz.programowanie2.weryfikacjaID;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class VerificationID {

    public Map<String, Integer> map = new HashMap<String, Integer>(){{
        put("A", 10);
        put("B", 11);
        put("C", 12);
        put("D", 13);
        put("E", 14);
        put("F", 15);
        put("G", 16);
        put("H", 17);
        put("I", 18);
        put("J", 19);
        put("K", 20);
        put("L", 21);
        put("M", 22);
        put("N", 23);
        put("O", 24);
        put("P", 25);
        put("Q", 26);
        put("R", 27);
        put("S", 28);
        put("T", 29);
        put("U", 30);
        put("V", 31);
        put("W", 32);
        put("X", 33);
        put("Y", 34);
        put("Z", 35);
            }};

    /**
     * Jeden ze sposobów pobierania z listy
     * @param uncheckIds
     * @return
     */

    public List<String> checkIds(List<String> uncheckIds) {
        uncheckIds.forEach(pes -> {
            int first = (int) pes.charAt(0);
            int second = (int) pes.charAt(1);
            int third = (int) pes.charAt(2);
            int value = map.get(first);
            int value2 = map.get(second);
            int value3 = map.get(third);
            //throw new NotImplementedException();
        });
        return null;
    }

    /**
     * Drugi sposób pozbierania z listy i zliczanie sumy
     * @param id
     * @return
     */

    public int calculateId(String id) {
        List<Integer> numberedId = changeToListofNumbbers(id);
        int first = numberedId.get(0)*7;
        int second = numberedId.get(1)*3;
        int third = numberedId.get(2);
        int fourth = numberedId.get(3)*9;
        int fifth = numberedId.get(4)*7;
        int sixth = numberedId.get(5)*3;
        int seventh = numberedId.get(6);
        int eighth = numberedId.get(7)*7;
        int ninth = numberedId.get(8)*3;

        int result = (first+second+third+fourth+fifth+sixth+seventh+eighth+ninth) % 10;
        return result;

    }

    public boolean checkid(String id) {
        int result = calculateId(id);
        boolean condition = false;
        if (result == 0){condition = true;};
        return condition;
    }

    public List<Integer> changeToListofNumbbers(String id){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i<3;i++){
            String letter  = String.valueOf(id.charAt(i));
            numbers.add(map.get(letter));
        }
        for(int i = 3; i < id.length();i++){
            int number = id.charAt(i);
            numbers.add(number);
        }return numbers;
    }
}


//        for (int i = 0; i < idNumbers.size(); i++) {
//            String idNumber = idNumbers.get(i);
//            int[] resultTemp = new int[9];
//            if (idNumber.length() == 9) {
//                for (int j = 0; j < idNumber.length(); j++) {
//                    char character = idNumber.charAt(j);
//                    if (j < 3) {
//                        resultTemp[j] = map.get(character);
//                    } else {
//                        resultTemp[j] = Character.getNumericValue(character);
//                    }
//                }
//                int result = resultTemp[0] * 7 + resultTemp[1] * 3 + resultTemp[2] * 1 + resultTemp[3] * 9 + resultTemp[4] * 7 +
//                        resultTemp[5] * 3 + resultTemp[6] * 1 + resultTemp[7] * 7 + resultTemp[8] * 3;
//                //wagi, reszta z dzielenia sumy iloczynów przez 10 powiinna ==0
//                if (result % 10 == 0) {
//                    resultList.add(idNumber);
//                }
//            }
//        }
//        return resultList;
//    }
//}

