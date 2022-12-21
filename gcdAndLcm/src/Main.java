import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] numberDivider = new int[20];


    public static void main(String[] args) {
        System.out.println("Welcome");
        chooseMenu();
    }
    public static void chooseMenu(){
        System.out.println("Plase Enter Two Numbers:");
        System.out.println("1. Number:"); int numberOne=scanner.nextInt();
        System.out.println("2. Number:"); int numberTwo=scanner.nextInt();
        System.out.println("Please make a selection:");
        System.out.println("1-Calculate the greatest common divisor\n2-least common multiple calculation");
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                GCDCalculator(numberOne,numberTwo);
                break;
            case 2:
                LCMCalculator(numberOne,numberTwo);
                break;
            default:
                System.out.println("Invalid Choose");
        }
    }
    public static void againProcces(){
        System.out.println("Would you like to trade again?");
        System.out.println("Y/N");
        String str=scanner.next();
        str.toLowerCase().substring(0,1);
        if (str.equals("y")){
            chooseMenu();
        }else {
            System.out.println("Good Bye");
            System.out.println("-----------------------------");

        }
    }

    public static void LCMCalculator(int numberOne, int numberTwo) {
        double LCM = numberOne * numberTwo / GCDCalculator(numberOne, numberTwo);
        System.out.println(LCM);
        againProcces();
    }

    public static int GCDCalculator(int numberOne, int numberTwo) {

        if (numberOne > numberTwo) {
            for (int i = 1; i <= numberOne; i++) {
                if (numberOne % i == 0 && (numberTwo % i) == 0) {
                    numberDivider[i] = i;

                    // System.out.println(i);
                }
            }
            Arrays.sort(numberDivider);
            int size = numberDivider.length;
            int a = numberDivider[size - 1]; System.out.println("GCD: " + a);
            return a;

        } else {
            for (int i = 1; i <= numberTwo; i++) {
                if (numberOne % i == 0 && (numberTwo % i) == 0) {
                    numberDivider[i] = i;
                    //System.out.println(i);
                }
            }
            Arrays.sort(numberDivider);
            int size = numberDivider.length;
            int a = numberDivider[size - 1];
            System.out.println("GCD: " + a);

            return a;
        }

    }


}