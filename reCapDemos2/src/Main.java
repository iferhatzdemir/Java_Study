import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter is Number");
        int number=scanner.nextInt();
        double [] myArray=new double[number];
        for (int i=0;i<number;i++){
            myArray[i]=Math.random()*10;
        }
        double total=0;
        double biggestNum=0;
        for (double arrItem:myArray){
            System.out.println(arrItem);
            total+=arrItem;
        }
        Arrays.sort(myArray);
        biggestNum=myArray[myArray.length-1];
        System.out.println("Max Number :"+biggestNum);
        System.out.println("Total: "+total);
    }
}