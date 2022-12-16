import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taksim Yol Ücreti Hesaplamaya Hoşgeldiniz!");
        taxiPrice(taxiMetInput());
    }
public static void  taxiPrice(double meter){
        double price=10+(meter*2.20);
        String paidPrice= (price>20)?"Ödencecek tutar:"+price+"TL":"Ödencecek tutar: 20TL";
    System.out.println(paidPrice);
    }

    public static double taxiMetInput() {
        Scanner sideInput = new Scanner(System.in);
        System.out.println("Kaç Kilometre Gittiniz? ");
        double meter = sideInput.nextDouble();


        return meter;
    }
}