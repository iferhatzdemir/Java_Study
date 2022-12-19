import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Main {
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
        }
    }
    public static void division(){
        Scanner addInput = new Scanner(System.in);
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
        Scanner againInput = new Scanner(System.in);

        String resultInput=againInput.next();
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
        Scanner addInput = new Scanner(System.in);
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
        Scanner addInput = new Scanner(System.in);
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
        Scanner addInput = new Scanner(System.in);
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
        Scanner addInput = new Scanner(System.in);
        System.out.println("Karakökünü Almak İstediğiniz Sayıyı Giriniz :");
        double firstNumber = addInput.nextDouble();
        double result=Math.sqrt(firstNumber);
        System.out.println(new DecimalFormat("#.#").format(firstNumber)+" 'nin karekökü= "+new DecimalFormat("#.#").format(result));
        System.out.println("\n-----------------------------------------------");
        againProcess();
    }
    public static void addition() {
        Scanner addInput = new Scanner(System.in);
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