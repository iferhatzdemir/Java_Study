import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("How many numbers in the Array");
        Scanner scanner =new Scanner(System.in);
        int arraySize = scanner.nextByte();
        int input;
        for (int i = 0; i < arraySize; i++){
            System.out.println(i+1+". Number");
            input = scanner.nextInt();
            numbers.add(input);
        }
     Collections.sort(numbers);
        System.out.println("-----------------------------------------------------------");
      System.out.println(numbers);
       // System.out.println(sort(numbers));
    }
     /*static ArrayList<Integer> sort(ArrayList<Integer> numbers){
        int current = 0;
        for (int i = 0; i < numbers.size(); i++){
            if(i+1==numbers.size()){
                break;
            }
            if (numbers.get(i)>numbers.get(i+1)){
                current =numbers.get(i);
                numbers.set(i,numbers.get(i+1));
                numbers.set(i+1,current);


            }

        }
        System.out.println(numbers);
         return numbers;
     }*/
}