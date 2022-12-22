import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> numbers=new ArrayList<Integer>();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world!");
        input();
    }
    public static void input(){
        System.out.println("Welcome");
        System.out.println("I will prepare a number box for you. If you know one of the numbers in this box, you will win and if you don't, you will lose.");
        System.out.println("You have a total of three rights.");
        System.out.println("How many numbers in your box:");
        int numberSize= scanner.nextInt();
        generateArray(numberSize);
        System.out.println("Let the Game Begin");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Your right:");
        int inp=scanner.nextInt();
        for (int i=3;i<5;i++){
            if (isCheckArr(inp)){
                System.out.println("Congratulations you won!");
                System.out.println("There are "+inp+" in your box.");
                break;
            }else {
                System.out.println("you didn't know");
                System.out.println(i-1+". Your right:");
                inp=scanner.nextInt();
            }

        }

    }
    public static Boolean isCheckArr(int checkNum){
        if (numbers.contains(checkNum)){
            return true;
        }else return false;
    }

    public static void generateArray(int ArrLength){
        for (int i=0;i<ArrLength;i++){
            Random random=new Random();
            int arrMember=random.nextInt(20);

            numbers.add(arrMember);
        }
    }


}