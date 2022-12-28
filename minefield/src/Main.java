import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Minesweeper");
        System.out.println("Please enter the dimensions you want to play with:");
        Scanner scanner=new Scanner(System.in);
        System.out.print("Rows:");
        int rows = scanner.nextInt();
        System.out.print("Colums:");
        int cols = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(rows, cols);
        mineSweeper.run();

    }
}