import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Enter a year:(YYYY)");
        boolean isLeapYear = false;
        int year =scanner.nextInt();

        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            isLeapYear=true;
        } else {

        isLeapYear=false;

        }
        if (isLeapYear){
            System.out.println(year+" is a leap year.");
        }else {
            System.out.println(year + " is not leap year");
        }

    }


}