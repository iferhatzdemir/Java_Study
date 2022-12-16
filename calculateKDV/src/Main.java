import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int choose = menuChoose();
        if (choose == 1) {
            calculteKdvPlus();
        } else if (choose == 2) {
        amountKDV();
        }else{

            System.out.println("Geçerli Bir Şeçim Tuşlayınız");
            choose = menuChoose();
        }
    }

    public static void amountKDV() {
        double principal = 0;


        double price = inputPrice();
        principal = (price * 100) / 118;
        double kdv = (price -principal);
        System.out.println("Anapara: 1" + principal);
        System.out.println("Kdv tutarı:" + kdv);
        System.out.println("---------------------------------------");
        System.out.println("Toplam Fiyat:" + price);

    }

    public static int menuChoose() {
        System.out.println("------ Hoşgeldiniz ------");
        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz:");
        System.out.println("1-KDV Dahil Fiyat Hesaplama");
        System.out.println("2-Toplam Fiyattaki KDVyi Hesaplama");
        System.out.println("---------------------------------------");
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        return input;
    }

    public static void calculteKdvPlus() {
        double price = inputPrice();
        double calResult = calculateKdv(price);
        double KDVprice = price + calResult;
        System.out.println("KDVsiz Fiyat: " + price);
        System.out.println("KDV: " + calResult);
        System.out.println("----------------------");
        System.out.println("Toplam : " + KDVprice);
    }

    public static double inputPrice() {
        System.out.println("Lütfen Fiyat Giriniz");
        double price = 0;
        Scanner inpPrice = new Scanner(System.in);
        price = inpPrice.nextDouble();
        return price;
    }

    public static double calculateKdv(double fiyat) {
        double kdv = 18;
        double result = (fiyat * 18) / 100;
        return result;

    }
}