import java.util.Scanner;

public class Main {
    public static         Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String word = getWords();
        printResults(isPalindromic(word), word);
    }

    public static void printResults(boolean isPalindromic, String words) {
        if (isPalindromic) {
            System.out.println(words + " is a palindromic word");
        } else {
            System.out.println(words + " is not a palindromic word");
        }
    }

    // Kelimenin her bir karakteri kontrol ediliyor
    public static boolean isPalindromic(String word) {
        boolean isPalindromic = false;


            if(word.equals(new StringBuilder(word).reverse().toString())){
            isPalindromic=true;}


        return isPalindromic;
    }
    public  static boolean ischeckApha(String word) {
        if(!(word.matches("A.Z-az"))){
            System.out.println("There are characters used other than letters");
            System.out.println("Try Again.");

            return false;
        }

        return true;
    }
    public static String getWords() {
        // Kullanıcıdan kelime girmesi için hoşgeldin mesajı yazdırıyoruz


        System.out.println("Welcome");
        // Bu programın kelimeyi tersine çevirip palindrom olup olmadığını kontrol ettiğini söylüyoruz
        System.out.println("This program checks if the word you entered is palindromic.");
        // Kullanıcıdan kelime girmesi için istek yazdırıyoruz
        System.out.println("Please enter a word:");
        // Kullanıcıdan girdi alıyoruz
        String word = scanner.next();
        while (true){
            if(ischeckApha(word)){break;}

            else {
            word=scanner.next();
            ischeckApha(word);
            }
        }

        //Kullanıcıdan kelime girmesini istedğimiz için cümle girse bile ilk kelimesini alacağız. bunun için trim kullanacağız trim :
        word = word.trim();

        //  word=word.substring(0,word.indexOf(" ")+1);
        //System.out.println(word);
        //return olarak işlem yaptığımız word kelimesini dönüyoruz
        return word;
    }

}