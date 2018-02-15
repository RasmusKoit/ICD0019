class Isik2 {
    String nimi;
    double pikkus;
    Isik2(String nimi, double pikkus) {
        this.nimi = nimi;
        this.pikkus = pikkus;
    }
    Isik2(){
        nimi = "Te ei sisestanud seda";
        pikkus = -1.0;
    }
    Isik2(double isikuPikkus){
        this("Niki Kolm", isikuPikkus);
    }
}