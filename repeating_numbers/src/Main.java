import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many  numbers in the array?");
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        int arraySize=scanner.nextInt();
        System.out.println("What is the maximum number in the array?");
        int max=scanner.nextInt();
        int [] array = new int [arraySize];
        for (int i=0; i<array.length; i++){
            array[i]=random.nextInt(max);
        }
   ArrayList<Integer>newArray=new ArrayList<Integer>();
   for (int i=0; i<array.length;i++){
       for (int j=0; j<array.length; j++){
           if (i!=j&&array[i]==array[j]&&array[i]%2==0){
               newArray.add(array[i]);
           }
       }
   }
        Collections.sort(newArray);
        System.out.println(newArray);
    }
}