package pl.sdacademy.java16poz.programowanie2.biednyCamelCase;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class camelCase {

    public String read() {

        File file = new File("D:\\IdeaProjects\\sda\\myproject\\src\\main\\java\\pl\\sdacademy\\java16poz\\programowanie2\\biednyCamelCase\\nazwa.txt");

        List<String> wordInBook = new ArrayList();

        try {
            String st;
            BufferedReader br = new BufferedReader(new FileReader(file));

            while ((st = br.readLine()) != null) {
                String[] wordLine = st.toLowerCase()
                        .trim()
                        .replace("?", " ").replace(":", " ").replace("\";", " ")
                        .replace("(", " ").replace(";", " ").replace("'", " ")
                        .replace(")", " ").replace("*", " " ).replace("-", " ")
                        .replace(",", " ")
                        .replace(".", " ")
                        .replace("!", " ")
                        .split(" ");

                wordInBook.addAll(Arrays.asList(wordLine));
            }



        } catch (EOFException e) {
            System.out.println("Problem z wczytaniem pliku");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Problem z wczytaniem pliku");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem z wczytaniem pliku");
            e.printStackTrace();
        }

//        for (int i = 0; i< wordInBook.size(); i++){
//            StringBuilder builder = new StringBuilder();
//            builder.append(wordInBook.get(i)).append(" ");
//            System.out.print(builder);
//        }

        Map<String, Integer> mapa = new HashMap<String, Integer>();

        for (String word : wordInBook){
            if (mapa.containsKey(word)){
                Integer x = mapa.get(word);
                x++;
                mapa.replace(word,x);
            }else {
                if (word.length()>5)
                    mapa.put(word, 1);
            }
        }

        Map.Entry<String, Integer> bestEntry = null;
        Map.Entry<String, Integer> bestEntry2 = null;
        Map.Entry<String, Integer> bestEntry3 = null;
        Map.Entry<String, Integer> bestEntry4 = null;
        Map.Entry<String, Integer> bestEntry5 = null;

        for (Map.Entry<String,Integer> entry : mapa.entrySet()){
            if (bestEntry==null || entry.getValue().compareTo(bestEntry.getValue()) > 0){
                bestEntry = entry;
            }
            if (bestEntry!=null && bestEntry2==null || entry.getValue().compareTo(bestEntry2.getValue()) > 0 && bestEntry!=entry  ){
                bestEntry2 = entry;
            }

            if (bestEntry!=null && bestEntry2!=null && bestEntry3==null || entry.getValue().compareTo(bestEntry3.getValue()) > 0 && bestEntry!=entry  && bestEntry2!=entry ){
                bestEntry3 = entry;
            }
            if (bestEntry!=null && bestEntry2!=null && bestEntry3!=null && bestEntry4==null|| entry.getValue().compareTo(bestEntry4.getValue()) > 0 && bestEntry!=entry  && bestEntry2!=entry && bestEntry3!=entry){
                bestEntry4 = entry;
            }
            if (bestEntry!=null && bestEntry2!=null && bestEntry3!=null && bestEntry4!=null && bestEntry5==null|| entry.getValue().compareTo(bestEntry5.getValue()) > 0 && bestEntry!=entry  && bestEntry2!=entry && bestEntry3!=entry && bestEntry4!=entry){
                bestEntry5 = entry;
            }

        }

        int wordCounter = wordInBook.size();

        StringBuilder builder = new StringBuilder();
        builder
                .append(bestEntry.getKey()).append(" ").append(bestEntry.getValue()).append("\n")
                .append(bestEntry2.getKey()).append(" ").append(bestEntry2.getValue()).append("\n")
                .append(bestEntry3.getKey()).append(" ").append(bestEntry3.getValue()).append("\n")
                .append(bestEntry4.getKey()).append(" ").append(bestEntry4.getValue()).append("\n")
                .append(bestEntry5.getKey()).append(" ").append(bestEntry5.getValue()).append("\n")
                .append("łącznie wszystkich słów było: ").append(wordCounter);

        return builder.toString();
    }


}
