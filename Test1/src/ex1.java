public class ex1 {


    private static int[] numberChecker(String[] args) {
        int[] nums = new int[5];
        try {
            for (int i = 0; i<args.length; i++){
                nums[i] = Integer.parseInt(args[i]);;
            }
        }catch (NumberFormatException e){
            System.out.println("Not an integer");
        }
        return nums;
    }

    private static void printAndSumNumbers(int[] list){
        int sum = 0;
        for (int aList : list) {
            sum += aList;
            System.out.println("Array number is: " + aList);
        }
        System.out.println("Sum of numbers is: " + sum);
    }

    public static void main(String[] args) {
        int[] nums;
        nums = numberChecker(args);
        printAndSumNumbers(nums);
    }
}
