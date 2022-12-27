import java.util.Random;

public class Main {
    // Bir matrisin transpozu
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Yeni matris oluşturun
        int[][] transposed = new int[cols][rows];

        // Matrisin transpozu
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        // Rastgele bir matris oluşturun
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }

        // Matrisi yazdırın
        System.out.println("Orijinal matris:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Matrisin transpozunu alın ve yazdırın
        int[][] transposed = transpose(matrix);
        System.out.println("\nTranspozu:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
