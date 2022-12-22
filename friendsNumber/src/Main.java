import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> totalDivider = new ArrayList<Integer>();
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
isFrendsCheck(inpNumbers());


    }
    public static int [] inpNumbers(){
        System.out.println("Welcome");
        System.out.println("If two numbers are equal to the sum of their divisors excluding themselves, these numbers are called friends.");
        System.out.println("Let's see if you and two numbers are friends:");
        System.out.println("I want you to say the first number:");
        int firstNumber= scanner.nextInt();
        System.out.println("Now it's time for the second issue:");
        int secondNumber=scanner.nextInt();
        int[] isFrendsArr = {firstNumber, secondNumber};
        return isFrendsArr;
    }
    public static void isFrendsCheck(int [] isFrendsArr){
        int total = 0;
        for (int i = 0; i < isFrendsArr.length; i++) {
            for (int k = 1; k < isFrendsArr[i]; k++) {
                if (isFrendsArr[i] % k == 0) {
                    total += k;

                }


            }
            totalDivider.add(total);
            total = 0;

        }
        if (totalDivider.get(0) == isFrendsArr[1] && totalDivider.get(1) == isFrendsArr[0]) {
            System.out.println(isFrendsArr[0] + " and " + isFrendsArr[1] + " are frends");
        } else {
            System.out.println(isFrendsArr[0] + " and " + isFrendsArr[1] + " are not frends");
        }
    }
}