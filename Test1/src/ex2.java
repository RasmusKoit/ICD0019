class ex2 implements math{
    private int x1;
    private int x2;
    ex2(){
        x1 = 2;
        x2 = 3;
    }
    ex2(int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public int addition(int x1, int x2) {
        return x1 + x2;
    }

    @Override
    public int addition() {
        return 0;
    }

    @Override
    public int multiplication(int x1, int x2) {
        return x1 * x2;
    }

    @Override
    public int multiplication() {
        return 0;
    }

/*    int multiply(){
        return x1 * x2;
    }*/
}
