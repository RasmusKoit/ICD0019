import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class FailiEditing {

    private static void usingScanner(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(input);
    }

    private static void usingFileWriter() {

        try {
            FileWriter fw = new FileWriter("Text.txt");
            fw.write("I am gay for Rasmus.");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("You fucked up the unfuckable, great job.");
            e.printStackTrace();
        }
    }

    private static void readingFile() {
        String fileName = "Text.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))){
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        usingScanner();
        usingFileWriter();
        readingFile();
    }

}
