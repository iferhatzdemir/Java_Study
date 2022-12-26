import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many harmonic numbers in the array?");
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int arraySize=scanner.nextInt();
        int [] numberArray = new int [arraySize];
        for (int i=0; i<numberArray.length; i++){
        numberArray[i]=random.nextInt(100);
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        int maxArray=0;
        int lastIndex=0;
        int minArray=0;
        System.out.println("Plase Enter a number");
        int input=scanner.nextInt();
        for (int i=0; i<numberArray.length;i++){
            if (input>numberArray[i]){
               lastIndex=i;
            }
        }
        System.out.println("The nearest number less than the entered number:"+numberArray[lastIndex]);
        System.out.println("The nearest number greater than the entered number:"+numberArray[lastIndex+1]);
    }
}