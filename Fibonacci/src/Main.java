import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("For Fibonacci, enter a number:");
        int input=scanner.nextInt();
        System.out.println(Arrays.toString(fibonacci(input)));
    }
    public static int[] fibonacci(int n) {
        // Eğer n 1 veya 0 ise, dizinin sadece bir elemanı olacak bir dizi oluştur
        if (n <= 1) {
            return new int[] { n };
        }
        // Eğer n 1'den büyükse, bir önceki dizinin uzunluğu bir artırılarak yeni bir dizi oluştur
        else {
            int[] previous = fibonacci(n-1);
            int[] current = new int[previous.length + 1];

            // Dizinin ilk iki elemanı sıfır ve bir olacak şekilde ayarla
            current[0] = 0;
            current[1] = 1;

            // Dizinin geri kalan elemanlarını doldur
            for (int i = 2; i < current.length; i++) {
                current[i] = current[i-1] + current[i-2];
            }

            // Doldurulmuş diziyi döndür
            return current;
        }
    }







}