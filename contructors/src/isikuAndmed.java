public class isikuAndmed {
    public static void main(String[] args) {
        Isik i = new Isik("Aadu", 1.99);
        Isik j = new Isik("Tormi", 12.99);
        System.out.println("Isiku nimi: " + i.nimi);
        System.out.println("Isiku nimi: " + j.nimi);
        System.out.println("Isiku pikkus: "+ i.pikkus);
        System.out.println("Isiku pikkus: "+ j.pikkus);

        Isik2 b = new Isik2(1.646);
        System.out.println("Nimi: "+ b.nimi+ " Pikkus: " + b.pikkus);

    }
}