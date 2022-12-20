import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner=new Scanner(System.in);
    public static Integer [] mod={0,1,2,3,4,5,6,7,8,9,10,11};
    public static String [] zodiacs={"Monkey","Cockerel","Dog","Pig","Mouse","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};
    public static void main(String[] args) {
        zoidacCal(birthday());
    }
    public static void zoidacCal(int birthday){
        int undivided=birthday%12;
        System.out.println(undivided);
        int zodiacIndex= Arrays.asList(mod).indexOf(undivided);
        System.out.println("Your Chinese Zodic:"+zodiacs[zodiacIndex]);

    }
    public static int birthday(){
        int birthday;
        System.out.println("Welcome");
        System.out.println("What is your chinese zodiac?");
        System.out.println("Please enter your year of birth (YYYY):");
        birthday=scanner.nextInt();
        return birthday;
    }

}