import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ymber {

    static void perm(String algus, String a, boolean valik) {
        if (a.length() == 1 && valik)
            System.out.println(algus + a.substring(0, 1));
            for (int i = 0; i < a.length(); i++)
                perm(algus + a.substring(i, i + 1),
                        a.substring(0, i) + a.substring(i + 1), valik);
    }
    static void replaceWord(String sona, String millest, String milleks) {
        System.out.println(sona.replace(millest, milleks));
        String failinimi = "replaced.txt";
        Scanner s = new Scanner(System.in);
        System.out.println("Sisesta midagi muud: ");
        String teineSona = s.nextLine();
        if (!teineSona.isEmpty()) {
            sona = teineSona;
        }

        try {
            FileWriter fw = new FileWriter(failinimi);
            FileReader fr = new FileReader(failinimi);
            fw.write(sona.replace(millest, milleks));
            fw.flush();
            fw.close();
            String read = fr.toString();
        } catch (IOException e) {
            System.out.println("ei saanud");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        String b = "ATIAAABD";
//        String c = "ATIAAABDAA";
//        long start=System.currentTimeMillis();
//        perm(" ", b, true);
//        long stop=System.currentTimeMillis();
//        System.out.println("Aega läks " + (stop - start) + "ms" + " Stringi pikkusega " + b.length());
//        start=System.currentTimeMillis();
//        perm(" ", c, false);
//        stop=System.currentTimeMillis();
//        System.out.println("Aega läks " + (stop - start) + "ms" + " Stringi pikkusega " + c.length());
        String sona = args[0];
        replaceWord(sona, "x", "ks");

    }
}