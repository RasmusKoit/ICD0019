public class ex2Caller {
    public static void main(String[] args) {
        ex2 calcEmpty = new ex2();
        ex2 calc = new ex2();

        System.out.println(calcEmpty.multiplication());
        System.out.println(calc.multiplication(5, 5));
        System.out.println(calc.addition(5, 5));
        System.out.println(calc.addition());
    }
}
