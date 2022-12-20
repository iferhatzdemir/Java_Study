import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Main Number");
        int mainNumber= scanner.nextInt();
        System.out.println("Number Power");
        int numberPower=scanner.nextInt();
        int defaultValue=1;
        for (int i=0;i<numberPower;i++)defaultValue*=mainNumber;
        System.out.println(mainNumber+" ^ "+numberPower+" = "+defaultValue);
    }
}