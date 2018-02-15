class calc {
    private double x1;
    private double x2;
    calc(double x1, double x2){
        this.x1 = x1;
        this.x2 = x2;
    }
    double liitmine(){
        return x1 + x2;
    }
    double lahutamine(){
        return x1 - x2;
    }
    double korrutamine(){
        return x1 * x2;
    }
    double jagamine(){
        return x1 / x2;
    }
}
