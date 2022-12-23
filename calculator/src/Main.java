import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static      Scanner addInput = new Scanner(System.in);
    public static void main(String[] args) {
        menuchoose();



    }

    public static void menuchoose() {
        Scanner menuInput = new Scanner(System.in);
        System.out.println("-------Hoşgeldiniz---------");
        System.out.println("\n");
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("5- Bir sayının kuvvetini alma");
        System.out.println("6- Bir sayının karekökünü alma");
        System.out.println("7- Bir sayının modunu  alma");
        System.out.println("8- Diktörtgen Alanı Hesaplama");
        System.out.println("9- Faktoriyel alma");
        int choose = menuInput.nextInt();
        menuRouter(choose);
    }
    public static void menuRouter(int chooseInput){
        switch (chooseInput){
            case 1:
                addition();
                break;
            case 2:
                extraction();
            case 3:
                multiplication();
                break;
            case 4:
                division();
                break;
            case 5:
                exponentiation();
                break;
            case 6:
                square();
                break;
            case 7:
                mod();
                break;
            case 8:
                area();
                break;
            case 9:
                System.out.println("Uzun kenarı Giriniz :");
                int n = addInput.nextInt();
                System.out.println( factorial(n));;
                againProcess();
                break;
        }
    }
    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void area(){
        System.out.println("Uzun kenarı Giriniz :");
        int firstNumber = addInput.nextInt();
        System.out.println("Kısa kenarı Giriniz :");
        int secondNumber = addInput.nextInt();
        int result=firstNumber*secondNumber;
        System.out.printf("Uzun Kenarı %d ve kenarı %d olan dikdörtgrnin alanı: %d", firstNumber, secondNumber, result);
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void mod(){

        System.out.println("Birinci Sayıyı Giriniz :");
        double firstNumber = addInput.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        double secondNumber = addInput.nextInt();
        double result=firstNumber%secondNumber;
        System.out.println(new DecimalFormat("#.#").format(firstNumber)+" % "+new DecimalFormat("#.#").format(secondNumber)+ " = "+new DecimalFormat("#.#").format(result));
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void division(){

        System.out.println("Birinci Sayıyı Giriniz :");
        double firstNumber = addInput.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        double secondNumber = addInput.nextInt();
        double result=firstNumber/secondNumber;
        System.out.println(new DecimalFormat("#.#").format(firstNumber)+" / "+new DecimalFormat("#.#").format(secondNumber)+ " = "+new DecimalFormat("#.#").format(result));
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public  static void  againProcess(){
        System.out.println("Tekrar İşlem Yapmak İster Misiniz?");
        System.out.println("Y/N");

        String resultInput=addInput.next();
        resultInput=resultInput.toLowerCase(Locale.ROOT).substring(0,1);
        switch (resultInput) {
            case "y":
                menuchoose();
                break;
            case  "n":
                System.out.println("Güle Güle");
                break;
            default:
                System.out.println("Geçerli bir işlem yapmadınız");
        }

    }
    public static void multiplication(){

        System.out.println("Birinci Sayıyı Giriniz :");
        int firstNumber = addInput.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        int secondNumber = addInput.nextInt();
        int result=firstNumber*secondNumber;
        System.out.printf("%d * %d = %d", firstNumber, secondNumber, result);
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void extraction(){

        System.out.println("Ana Sayıyı Giriniz :");
        int firstNumber = addInput.nextInt();
        System.out.println("Çıkarılacak Sayıyı Giriniz :");
        int secondNumber = addInput.nextInt();
        int result=firstNumber-secondNumber;
        System.out.printf("%d - %d = %d", firstNumber, secondNumber, result);
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void exponentiation() {

        System.out.println("Birinci Sayıyı Giriniz :");
        double firstNumber = addInput.nextDouble();
        System.out.println("İkinci Sayıyı Giriniz :");
        double secondNumber = addInput.nextDouble();
        double result=Math.pow(firstNumber,secondNumber);
        System.out.println(new DecimalFormat("#.#").format(firstNumber)+" ^ "+new DecimalFormat("#.#").format(secondNumber)+ " = "+new DecimalFormat("#.#").format(result));

        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void square() {

        System.out.println("Karakökünü Almak İstediğiniz Sayıyı Giriniz :");
        double firstNumber = addInput.nextDouble();
        double result=Math.sqrt(firstNumber);
        System.out.println(new DecimalFormat("#.#").format(firstNumber)+" 'nin karekökü= "+new DecimalFormat("#.#").format(result));
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void addition() {

        System.out.println("Birinci Sayıyı Giriniz :");
        int firstNumber = addInput.nextInt();
        System.out.println("İkinci Sayıyı Giriniz :");
        int secondNumber = addInput.nextInt();
        int result=firstNumber+secondNumber;
        System.out.printf("%d + %d = %d", firstNumber, secondNumber, result);
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
}