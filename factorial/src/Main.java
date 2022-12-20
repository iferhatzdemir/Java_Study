import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the number you want to calculate the factorial:");
        int input=scanner.nextInt();
        int factorial=1;
        for (int i=1;i<input+1;i++  ){
            factorial*=i;
        }
        System.out.println(input+"'s factorial:"+factorial);
    }
}