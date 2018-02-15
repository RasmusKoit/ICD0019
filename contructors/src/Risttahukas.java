class Risttahukas {
    private double pikkus;
    private double laius;
    private double korgus;

    Risttahukas(double pikkus, double laius, double korgus){
        this.pikkus = pikkus;
        this.laius = laius;
        this.korgus = korgus;
    }
    Risttahukas(double pikkus){
        this.pikkus = pikkus;
        laius = 0.0;
        korgus = 0.0;
    }
    Risttahukas(){
        pikkus = 0.0;
        laius = 0.0;
        korgus = 0.0;
    }
    String stringiks(){
        return "Pikkus: " + pikkus + "\nLaius: " + laius + "\nKorgus: " + korgus;
    }
    String stringiksPLK(String v){
        if (v.equalsIgnoreCase("pikkus")){
            return "" + pikkus;
        }
        else if (v.equalsIgnoreCase("laius")){
            return "" + pikkus;
        }
        else if (v.equalsIgnoreCase("korgus")){
            return "" + korgus;
        }
        else
            return "Ei leidnud vajaliku sona";
    }
}
