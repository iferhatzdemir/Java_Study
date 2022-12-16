import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hipotenüsün Değeri : "+hipotenus(inputSide()));
    }
    public static int [] inputSide(){
        Scanner sideInput= new Scanner(System.in);
        System.out.println("------ Hoşgeldiniz --------");
        System.out.println("İlk kenarı giriniz: ");
        int side1=sideInput.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        int side2=sideInput.nextInt();

        int [] sideArray={side1,side2};

        return sideArray;
    }
    public static double hipotenus(int [] sides){
        double hipoyenusVal=0;
        hipoyenusVal = Math.pow(sides[0],2)+Math.pow(sides[1],2) ;
        hipoyenusVal=Math.sqrt(hipoyenusVal);
        return hipoyenusVal;
    }
}