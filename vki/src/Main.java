import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculeteDMI(dmıInput());
    }
    public static void calculeteDMI(double @NotNull [] item){
        double DMI=item[0]/Math.pow(item[1],2 );
        System.out.println("Vücut Kitle İndeksi : "+DMI);
    }
    public static double []  dmıInput(){
        Scanner dmıInp= new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu Girin");
        double weight=dmıInp.nextDouble();
        System.out.println("Lütfen Boyunuzu Girin");
        double length=dmıInp.nextDouble();
        double [] items= {weight,length};
        return items;
    }
}