import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> boldVowels = new ArrayList<>();
    public static ArrayList<String> thinVowels = new ArrayList<>();

    public static void main(String[] args) {
        boldVowels.add("a");
        boldVowels.add("u");
        boldVowels.add("ı");
        boldVowels.add("o");
        thinVowels.add("e");
        thinVowels.add("i");
        thinVowels.add("ö");
        thinVowels.add("ü");
        checkVowels(input());
    }

    public static void checkVowels(String str) {
        int volwelsIndex = 0;

        if (boldVowels.contains(str)) {
            System.out.printf("%s vowels are bold.", str);
        } else if (thinVowels.contains(str)) {
            System.out.printf("%s vowels are thin.", str);
        } else {
            System.out.println(str + " is not volwes");
        }

    }

    public static String input() {
        System.out.println("Welcome\nPlease enter a vowel:");
        String inpStr = scanner.next();
        inpStr = inpStr.substring(0, 1);
        inpStr = inpStr.trim();
        inpStr = inpStr.toLowerCase();

        return inpStr;
    }
}