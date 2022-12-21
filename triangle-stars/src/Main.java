import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
    shapeTriangel();
    }
    public static void shapeTriangel(){
        System.out.println("Welcome");
        System.out.println("Enter a Line Numnbers");
        int lineNumber=scanner.nextInt();
        for (int i = 1; i <= lineNumber - 1; i++) {
            for (int space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * (lineNumber - i) - 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}