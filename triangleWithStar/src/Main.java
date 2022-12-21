import java.awt.*;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       welcome();



    }public static void welcome(){
        System.out.println("Welcome:");
        System.out.println("1-Triangle\n2-Chrismas Tree\n3-Diamond");
        System.out.println("Choose:");
        int choose=scanner.nextInt();
        System.out.println("Enter Number of Digits:");
        int n = scanner.nextInt();
        if (choose==1) triangle(n);
        else if (choose==2) christmasTree(n);
        else if (choose==3)equilateral(n);
        else {
            System.out.println("Try Again!");
            welcome();
        }
    }
    public static void equilateral(int n){ int lineNumber, i, space, star;
        char symbol = '*';
        lineNumber=n;
        for (i = 0; i < lineNumber; i++) {

            for (space = 1; space < lineNumber - i; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= (2 * i) + 1; star++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (i = 1; i <= lineNumber - 1; i++) {
            for (space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (star = 1; star <= 2 * (lineNumber - i) - 1; star++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
public static void christmasTree(int a){
    for (int i=0; i <=a; i++){
        for (int k=1;k<=(a-i);k++)System.out.print(" ");
        for (int l=1;l<=(2*i+1);l++) System.out.print("*");
        System.out.println(" ");
    }
    for(int i = 1;i <= a/2;i++)
    {
        System.out.print(" ");
        for(int j = a-2;j > 0;j--)
        {
            System.out.print(" ");
        }
        for(int k = 2;k > 0;k--)
        {
            System.out.print("| ");
        }
        System.out.println();
    }
}
    public static void triangle(int a) {
        for (int i=0; i <=a; i++){
            for (int k=1;k<=(a-i);k++)System.out.print(" ");
            for (int l=1;l<=(2*i+1);l++) System.out.print("*");
            System.out.println(" ");
        }

    }
}