import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner inputs = new Scanner(System.in);
    public static void main(String[] args) {

        int [] arr=getNumber(countNumber());
        routeAlgo(arr,chooseSorting());

    }




    public static int  countNumber(){
        System.out.println("Welcome");
        System.out.println("How many numbers would you like to sort?");
        int countNum=inputs.nextInt();
        return countNum;
    }
    public static void routeAlgo(int [] arr,int choose){
        if (choose==1){
            selectionSort(arr);

        }else if (choose==2){
            insertionSort(arr);
        }else if (choose==3){
            bubbleSort(arr);
        }else if(choose==4)
        {
            int [] arr2;
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int chooseSorting(){
            System.out.println("Please Select Sorting Algorithm:");
            System.out.println("Selection Sort: 1");
            System.out.println("Insertion Sort: 2");
            System.out.println("Bubble Sort:3");
        System.out.println("Java Sort:4");
            int choooeSorting=inputs.nextInt();
            return choooeSorting;
    }
    public static void bubbleSort(int arr[]) {
        boolean swapped = false;
        do {
            swapped = false;
            for(int i=1; i<arr.length; i++) {
                if( arr[i-1] > arr[i] ) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int [] getNumber(int countNumber){
        int [] getNum=new int[countNumber];

        for (int i=0;i<countNumber;i++){
            System.out.printf("Enter the %d th number:",i);
            System.out.println("\n");
            getNum[i]=inputs.nextInt();

        }
        System.out.println(Arrays.toString(getNum));




        return getNum;
    }
}