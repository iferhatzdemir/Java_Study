import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static ArrayList<Integer> numbers=new ArrayList<Integer>();
    public static void main(String[] args) {
        getInput();
    }
    public static void getInput(){
        System.out.println("Welcome");
        System.out.println("Enter the Perfect Number:");
        int number=scanner.nextInt();
        isPerfectNumber(number);
    }
    public static void againProcces(){
        System.out.println("Would you like to trade again?");
        System.out.println("Y/N");
        String str=scanner.next();
        str.toLowerCase().substring(0,1);
        if (str.equals("y")){
            getInput();
        }else {
            System.out.println("Good Bye");
            System.out.println("-----------------------------");

        }
    }
    public static void isPerfectNumber(int number){
        for (int i=1;i<=number+1;i++){
            if (number%i==0){
                numbers.add(i);
            }
            }
        int total=0;
        for (int i=0;i<=numbers.size()-1;i++){
            total+=numbers.get(i);

        }
        if (total==number*2){
            System.out.println(number+" is perfect number");
        }else{
            System.out.println(number+" is not perfect number");
        }
        againProcces();
    }
}