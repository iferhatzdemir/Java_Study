import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // number değişkeni bir sayı tutacak
    public static int number = 0;
    // inp değişkeni kullanıcının girdiği sayıyı tutacak
    public static int inp = 0;
    // predictions listesi kullanıcının tahminlerini tutacak
    public static ArrayList<Integer> predictions = new ArrayList<Integer>();
    // scanner nesnesi kullanıcıdan girdi almak için kullanılacak
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
// input() fonksiyonunu çağırıyoruz
        input();
    }

    public static void input() {
// Kullanıcıya hoşgeldin mesajı yazdırıyoruz
        System.out.println("Welcome");
// Kullanıcıya oyun hakkında bilgi veriyoruz
        System.out.println("I will keep a number for you. If you know this number, you will win, if not, you will lose.");
// Kullanıcının toplamda beş hakkı olduğunu söylüyoruz
        System.out.println("You have a total of five rights.");
// Random sınıfını kullanarak 0 ile 100 arasında bir sayı üretiyoruz
        /*Ana program çalıştırıldığında, bir hoşgeldin mesajı gösterilir ve kullanıcıya oyun hakkında bilgi verilir. Daha sonra, rastgele bir sayı 0 ile 100 arasında üretilir ve oyun başlar. Kullanıcı ilk hakkını kullanarak bir tahmin yapar ve getNumber() fonksiyonu çağırılarak bu tahmin alınır. Daha sonra, kullanıcının tahmininin doğru olup olmadığı isCheckArr() fonksiyonu ile kontrol edilir. Eğer tahmin doğruysa, kullanıcıya kazandığını bildiren bir mesaj gösterilir ve oyun sonlandırılır. Eğer tahmin yanlışsa, kullanıcının hak sayısı azaltılır ve kullanıcıya hakkının kaldığını bildiren bir mesaj gösterilir. Kullanıcı tekrar bir tahmin yapar ve bu işlem beş kez tekrar eder. Eğer kullanıcı beş hakkını da yanlış kullanırsa, oyun sona erer ve kullanıcıya kaybettiği bildirilir. Doğru cevapla ilgili bilgi ve kullanıcının tahminleri listesi gösterilir.*/
        Random rand = new Random();
        number = rand.nextInt(100);
        System.out.println("Let the Game Begin");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Your right:");
        inp = getNumber();

        for (int i = 3; i < 7; i++) {
            if (isCheckArr(inp)) {
                System.out.println("Congratulations you won!");
                System.out.println("There are " + inp + " in your box.");
                break;
            } else {
                System.out.println("you didn't know");
                System.out.println(i - 1 + ". Your right:");
                getNumber();


            }
            if (i - 1 == 5) {
                System.out.println("--------------------------------------------------------");
                System.out.println("You Lost!");
                System.out.println("Your Predictions:");
                System.out.println(predictions);
                System.out.println("Correct Number:" + number);
            }

        }
        predictions.add(inp);

    }

    static int getNumber() {
        int inp = scanner.nextInt();
        if (inp > 0 && inp < 101) {
            predictions.add(inp);
            return inp;
        } else {

            System.out.println("Enter a number between 0 and 100");
            System.out.println("Try Again:");
            getNumber();
        }
        return 0;
    }

    public static Boolean isCheckArr(int checkNum) {
        if (number == (checkNum)) {
            return true;
        } else return false;
    }


}