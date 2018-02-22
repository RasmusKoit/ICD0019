class Ruut extends Shape{

    int length;

    Ruut(int xCord, int yCord, int sizeLength){
        x = xCord;
        y = yCord;
        length = sizeLength;
    }

    public double ymberm() {
        return (double) (4 * length);
    }

    public double pikkus(){
        return length;
    }

    public double pindala(){
        return (double) (length * length);
    }



}
