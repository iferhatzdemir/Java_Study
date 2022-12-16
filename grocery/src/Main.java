import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        amount(kilos());
    }
    public static void amount(double []kilos){
        System.out.println("-------------------------------------");
        double [] price={2.14,3.67,1.11,0.95,5.00};
        String [] product={"Armut","Elma","Domates","Muz","Patlıcan"};
        double total=0;
        if(price.length==kilos.length){
            for (int i=0;i<kilos.length;i++){
                double prodPrice= price[i]*kilos[i];
                total+=price[i]*kilos[i];
                System.out.println(kilos[i]+" Kg "+product[i]+" tutarı :"+prodPrice);
            }
            System.out.println("-------------------------------------");
            System.out.println("Toplam Tutar :"+total+" TL");
        }
    }
    public static double [] kilos(){
        Scanner inpKilos= new Scanner(System.in);
        System.out.println("Armut Kaç Kilo?");
        double pearKg=inpKilos.nextDouble();
        System.out.println("Elma Kaç Kilo?");
        double appleKg=inpKilos.nextDouble();
        System.out.println("Domates Kaç Kilo?");
        double tomatoKg=inpKilos.nextDouble();
        System.out.println("Muz Kaç Kilo?");
        double bananaKg=inpKilos.nextDouble();
        System.out.println("Patlıcan Kaç Kilo?");
        double aubergineKg=inpKilos.nextDouble();
        double []kilos={pearKg,appleKg,tomatoKg,bananaKg,aubergineKg};
        return kilos;
    }
}