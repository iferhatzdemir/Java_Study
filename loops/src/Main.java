import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static int[] Numbers = new int[10];

    public static void main(String[] args) {
        doWhileLoop();
        forLoop();
        whileLoop();
    }

    public static void forLoop() {
        for (int i = 0; i < 10; i++) Numbers[i] = i;
        System.out.println(Arrays.toString(Numbers));
    }

    ;

    public static void whileLoop() {

        int i = 1;
        while (i < Numbers.length) {
            Numbers[i] = i;
            i++;
        }
        System.out.println(Arrays.toString(Numbers));
    }
    public static void doWhileLoop() {

        int i = 1;
        do {
            Numbers[i] = i;
            i++;
        }while (i < Numbers.length);
        System.out.println(Arrays.toString(Numbers));
    }

}

