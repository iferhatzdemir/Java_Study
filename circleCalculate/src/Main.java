import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double diameter=diameterInput();
        calculateArea(diameter);
        calculatePerimeter(diameter);
    }
    public static double diameterInput(){
        System.out.println("Lütfen Dairenin Çapını Giriniz: ");
        Scanner diaInput=new Scanner(System.in);
        double diameter=diaInput.nextDouble();
        return diameter;
    }
    public static void  calculateArea(double diameter){
        double area=Math.PI*Math.pow(diameter,2);
        System.out.println("Circle's Area: "+area);
    }
    public static void calculatePerimeter(double diameter){
        double perimeter=2*diameter*Math.PI;
        System.out.println("Circle's Perimeter: "+perimeter);
    }
}