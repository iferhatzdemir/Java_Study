import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collection.*;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static ArrayList<Integer> numbers=new ArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("Welcome");
       chooseMenu();

    }
public static void sortArrayList(int numberSize){
    for (int i=0;i<numberSize;i++){
        int queeNumber=i+1;
        System.out.printf("Enter the %d number: ",queeNumber);
        int inpNumber=scanner.nextInt();
        numbers.add(inpNumber);

    }
    Collections.sort(numbers);
}

    public static void findMax(int numberSize){
       sortArrayList(numberSize);
        int getMaxSiza=numbers.size()-1;
        int max=numbers.get(getMaxSiza);
        System.out.println("Largest number you entered: "+max);
        System.out.println("---------------------------------------");
        againProcces();

    };
    public static void findMin(int numberSize){
        sortArrayList(numberSize);
        int min=numbers.get(0);
        System.out.println("The smallest number you entered: "+min);
        System.out.println("---------------------------------------");
        againProcces();
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
    public static void chooseMenu(){
        System.out.println("How Many Numbers You Will Enter:");
        int numberSize= scanner.nextInt();
        System.out.println("-----------------");
        System.out.println("Please select action:");
        System.out.println("1-Finding the Max value\n2-Finding the Max value");
        int menuChoose=scanner.nextInt();
        switch (menuChoose){
            case 1:
                findMax(numberSize);
                break;
            case 2:
                findMin(numberSize);
                break;
            default:
                System.out.println("Invalid Choose");
                chooseMenu();


        }
    }
}