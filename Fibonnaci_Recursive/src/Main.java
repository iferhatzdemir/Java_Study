import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = findFactorial(num);
        System.out.println("Factorial of " + num + ": " + result);
    }

    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFactorial(n-1);
        }
    }
}
