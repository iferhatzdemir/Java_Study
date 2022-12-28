import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowCount, colCount, size;
    int[][] map;
    int[][] board;
    boolean isGame = true;
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    MineSweeper(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.map = new int[this.rowCount][this.colCount];
        this.board = new int[this.rowCount][this.colCount];
        this.size = this.rowCount * this.colCount;
    }

    public void run() {
        int rows, cols;
        int success =0;
        prepareGame();
        print(map);
        System.out.println("Game has started!");

        while (isGame) {
            print(board);

            System.out.print("Rows:");
            rows = scanner.nextInt();
            System.out.print("Colums:");
            cols = scanner.nextInt();
            if(rows< 0 || rows>=this.rowCount){
                System.out.println("Invalid coordinate!"); continue;

            } if(cols< 0 || cols>=this.colCount){
                System.out.println("Invalid coordinate!"); continue;

            }
            if (map[rows][cols] != -1) {
                isCheckMine(rows, cols);
                success++;
                if (success==(size-(size/4)))
                {
                    System.out.println("You a Winner!");
                    break;
                }
            } else {
                isGame = false;

                System.out.println("Game Over!");
                print(map);
            }

        }
    }

    public void isCheckMine(int rows, int cols) {

        if (map[rows][cols] == 0 && board[rows][cols]==0) {

            if ((cols < this.colCount - 1) && (map[rows][cols + 1] != -1)) {
                board[rows][cols ] += 1;
            }
            if ((rows < this.rowCount - 1) && (map[rows + 1][cols] != -1)) {
                board[rows ][cols] += 1;
            }
            if ( (cols > 0)&&(map[rows][cols -1] != -1) ) {
                board[rows][cols ] += 1;
            }
            if ( (rows > 0)&&(map[rows - 1][cols] != -1) ) {
                board[rows ][cols] += 1;
            }
            if (board[rows][cols]==0){
                board[rows][cols]=-2;
            }

        }else{
            System.out.println("You've looked here before!");
        }

    }

    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != size / 4) {
            randRow = rand.nextInt(this.rowCount);
            randCol = rand.nextInt(this.colCount);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >= 0) System.out.print(" ");
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------------");
    }
}
