import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        sayi1=0;
        sayi2=0;
        sayi3=0;

    int [] a =inputSayi(sayi1,sayi2,sayi3);
    int biggest=biggest(a);
    System.out.println("En büyük Sayı: "+biggest);

    }
    public static int biggest (int [] a ){
        int currentNumber=0;
        for (int i=0;i<a.length;i++){
            if (currentNumber<a[i]){
                currentNumber=a[i];
            }
        }
        return currentNumber;
    }
    public static int[] inputSayi(int sayi1, int sayi2, int sayi3) {
        Scanner giris = new Scanner(System.in);
        System.out.println("1.sayıyı girin:");
        sayi1 = giris.nextInt();

        System.out.println("2.sayıyı girin:");
        sayi2 = giris.nextInt();
        System.out.println("3.sayıyı girin:");
        sayi3 = giris.nextInt();
        int[] dizi = {sayi1, sayi2, sayi3};
        return dizi;
    }}

