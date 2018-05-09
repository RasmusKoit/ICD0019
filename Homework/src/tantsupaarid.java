import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.*;

public class tantsupaarid {

    private static List<Integer> readingFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(item->list.add(Integer.parseInt(item)));
        } catch (IOException e) {
            System.out.println("something went wrong");
            e.printStackTrace();
        }
        return list;
    }

    private static void pairPartners(List boysList, List girlsList) {
        if (boysList.size() == girlsList.size()){
            for (int i =0;  i<boysList.size(); i++){
                System.out.print("(" + boysList.get(i) + ") (" + girlsList.get(i) + ")");
            }
        }
        else if(boysList.size() > girlsList.size()) {
            for (int i = 0; i<girlsList.size(); i++){
                System.out.println("(" + boysList.get(i) + ") (" + girlsList.get(i) + ")");
            }
            int leftover = boysList.size() - girlsList.size();
            System.out.println("Paariliseta j2id poisid pikkustega: ");
            for (int i = boysList.size()-leftover; i<boysList.size(); i++){
                System.out.println(boysList.get(i));
            }
        }
        else {
            for (int i = 0; i<boysList.size(); i++){
                System.out.println("(" + boysList.get(i) + ") (" + girlsList.get(i) + ")");
            }
            int leftover = girlsList.size() - boysList.size();
            System.out.println("Paariliseta j2id tydrukud pikkustega: ");
            for (int i = girlsList.size()-leftover; i<girlsList.size(); i++){
                System.out.println(girlsList.get(i));
            }
        }

    }

    public static void main(String[] args) {
        List boysList = readingFile("boys.txt");
        List girlsList = readingFile("girls.txt");
        System.out.println("Poiste pikkused: " + boysList);
        System.out.println("Tydrukute pikkused: " + girlsList);
        sort(boysList);
        sort(girlsList);
        System.out.println("Tantsupaarid on:");
        pairPartners(boysList, girlsList);

    }
}