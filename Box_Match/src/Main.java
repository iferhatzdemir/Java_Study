import java.util.Random;

public class Main {
    public  static Random random = new Random();
    public static void main(String[] args) {
        System.out.println("Welcome to the Boks Match");
        Fighter f1= new Fighter("Ahmet",random.nextInt(100),100,80,random.nextInt(100), random.nextInt(2));
        Fighter f2= new Fighter("Ferhat",random.nextInt(100),100,80,random.nextInt(100), random.nextInt(1));
        Match m1= new Match(f1,f2,70,150);
        m1.run();
    }
}