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
        for (int i=0; i<array.length-1; i++){
            array[i]=random.nextInt(max);
        }
        ArrayList<Integer>newArray=new ArrayList<Integer>();

        for (int i=0; i<array.length;i++){
            for (int j=0; j<array.length; j++){
                if (i!=j&&array[i]==array[j]){
                    newArray.add(array[i]);

                }
            }

        }
        System.out.println(newArray);
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i : newArray) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }


        for (int key : frequency.keySet()) {
            System.out.println(key + ": " + frequency.get(key));
        }


    }
}