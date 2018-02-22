class Ring extends Shape {

    int r;

    Ring(int xCord, int yCord, int raadius) {
        x = xCord;
        y = yCord;
        r = raadius;
    }

    public double ymberm() {
        return (double) (Math.PI * (r * 2));
    }

    public double Raadius() {
        return (double) r;
    }

    public double pindala(){
        return (double) (Math.PI * (Math.pow((double) r, 2.0)));
    }

    public int anchorX(){
        return x-r;
    }

    public int anchorY(){
        return y-r;
    }
}
