public class Box extends Shape{
    int lengthA;
    int lengthB;

    Box(int xCord, int yCord, int sizeLength1, int sizeLength2){
        x = xCord;
        y = yCord;
        lengthA = sizeLength1;
        lengthB = sizeLength2;
    }
    public int anchorX(){
        return x-lengthA;
    }

    public int anchorY(){
        return y-lengthB;
    }

    double ymberm() {
        return (double)(2 * lengthA + 2 * lengthB);
    }

    double pindala(){
        return (double) lengthA * lengthB;
    }

    public String toString(double arv) {
        return ("Sisestatud arv tekstina:" + arv );
    }
}
