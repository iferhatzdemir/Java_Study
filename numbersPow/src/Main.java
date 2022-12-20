import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scaner=new Scanner(System.in);
    public  static int arrayLength=100;
    public static double [] FivePower=new double[arrayLength];
    public static double [] FourPower=new double[arrayLength];

    public static double [] TwoPower=new double [arrayLength];
    public static void main(String[] args) {
  numberPow();
    }
    public static void numberPow(){
        System.out.println("How Many Numbers to Search? :");
        int maxNumber=scaner.nextInt();

        for (int i=0;i<maxNumber;i++){
            arrayLength++;
            double twoPower=Math.pow(2,i);
            if (twoPower<maxNumber) TwoPower[i] = twoPower;
            double fourPower=Math.pow(4,i);
            if (fourPower<maxNumber) FourPower[i] =fourPower;
            double fivePower=Math.pow(5,i);
            if (fivePower<maxNumber) FivePower[i] = fivePower;

        }
        if (TwoPower.length>0){
         System.out.println(Arrays.toString(TwoPower));
       }else{
            System.out.println("Not Found Two's Powers");
        }
        if (FourPower.length>0){
            System.out.println(Arrays.toString(FourPower));
        }else{
            System.out.println("Not Found Four's Powers");
        }
        if (FivePower.length>0){
            System.out.println(Arrays.toString(FivePower));
        }else{
            System.out.println("Not Found Five's Powers");
        }
    }









}