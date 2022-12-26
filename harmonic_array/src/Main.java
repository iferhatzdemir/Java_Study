import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many harmonic numbers in the array?");
        Scanner scanner = new Scanner(System.in);
        int arraySize=scanner.nextInt();
     double [] harmonicNumbers = new double[arraySize];
        for (int i=1; i<harmonicNumbers.length+1; i++){
            harmonicNumbers[i-1]=1.0/i;
        }
        double harmonicTotal=0;
        for (int i=0; i<harmonicNumbers.length; i++){
            harmonicTotal+=harmonicNumbers[i];
        }

        System.out.println(harmonicNumbers.length/harmonicTotal);

    }


}