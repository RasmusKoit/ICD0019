import java.util.Random;

public class Juhuslik extends java.util.Random {
    int a, b;
    int answer;
    Random rand = new Random();
    Juhuslik(){
        answer = rand.nextInt(2);
    }

    Juhuslik(int valik) {
        a = valik;
        answer = rand.nextInt(valik + 1);
    }

    Juhuslik(int valik1, int valik2) {
        a = valik1;
        b = valik2;
        answer = rand.nextInt(b - a + 1) + a;
        System.out.println("Vahepealne vastus" + answer);
    }
}
