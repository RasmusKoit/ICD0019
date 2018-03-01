import java.util.Arrays;
import java.util.Random;

public class NumGenerator {
    public static void main(String[] args) {
        Random rnd = new Random();
        int arv = rnd.nextInt(5);
        int[] list = new int[arv];
        for (int i = 0; i < arv; i++) {
            list[i] = rnd.nextInt(100);
            System.out.println(list[i]);
        }

        System.out.println("Sorted List");
        Arrays.sort(list);
        for (int num: list) {
            System.out.println(num);
            
        }


    }
}
