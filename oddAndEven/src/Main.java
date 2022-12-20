import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int i = 1;
    public static int total;
    public static int input;

    public static void main(String[] args) {
        chooseApp();
    }

    public static void chooseApp() {
        System.out.println("Welcome");
        String messageAppOne = "APP1: Accepts inputs from the user until a single number is entered, adds the numbers that are even and multiples of 4 from the entered values and prints them on the screen";
        String messageAppTwo = "APP2: It accepts input from the user until a negative value is entered, then adds the odd numbers from the entered values and prints them on the screen.";
        int lineCount = (messageAppTwo.length() > messageAppOne.length()) ? messageAppTwo.length() : messageAppOne.length();
        System.out.println(messageAppOne);
        System.out.println(messageAppTwo);
        for (int i = 0; i < lineCount; i++) {
            System.out.printf("-");
        }
        System.out.println("\nChoose APP:\nAPP1->1\nAPP2->2");
        System.out.println("Choose:");
        int input = scanner.nextInt();
        if (input < 3 && input > 0) {
            if (input == 1) appOne();
            else appTwo();
        } else {
            System.out.println("Try Again\n");
            chooseApp();
        }
    }

        public static void appOne () {

            while (i == 1) {

                System.out.println("Please Enter Number:");

                input = scanner.nextInt();

                if (input % 2 == 1) {
                    System.out.println("Total:" + total);
                    break;
                }
                if (input % 2 == 0 && input % 4 == 0) total += input;

            }
        }
        public static void appTwo () {

            while (i == 1) {

                System.out.println("Please Enter Number:");
                input = scanner.nextInt();

                if (input < 0) {
                    System.out.println("Total:" + total);
                    break;
                }
                total += input;

            }
        }

    }