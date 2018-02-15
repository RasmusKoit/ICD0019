public class rts {
    public static void main(String[] args){
        Risttahukas r1 = new Risttahukas(3.5, 4.3, 2.1);
        Risttahukas r2  = new Risttahukas(9.4);
        Risttahukas r3 = new Risttahukas();
        System.out.println("R3: " + r3.stringiks() + "\nR2: " + r2.stringiks() + "\nR1 "+ r1.stringiks());
    }
}
