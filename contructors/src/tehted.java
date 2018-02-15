public class tehted {
    public static void help(){
        System.out.println("Kasutus nt: 2 3 liitmine");
    }
    public static void main(String[] args){
        if ( !(args.length == 3)){
            help();
            System.exit(-1);
        }
        double x1 = Double.valueOf(args[1]);
        double x2 = Double.valueOf(args[2]);
        calc c = new calc(x1, x2);
        switch (args[0]){
            case "liitmine":
                System.out.println("+ = " + c.liitmine());
                break;
            case "lahutamine":
                System.out.println("- = " + c.lahutamine());
                break;
            case "korrutamine":
                System.out.println("- = " + c.korrutamine());
                break;
            case "jagamine":
                System.out.println("- = " + c.jagamine());
                break;
            default:
                System.out.println("Valitud operatsioon pole toetatud");

        }
    }
}
