import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static Scanner gradepoint=new Scanner(System.in);
    public static void main(String[] args) {
        isGrade(calcAverage(inputPoint()));
    }

    public static void isGrade(double Average) {
        if (Average>80 && Average<=100){
            System.out.println("Average:"+new DecimalFormat("#.#").format(Average)+" Note: A Success");
        }else if (Average>70 && Average<=80){
            System.out.println("Average:"+new DecimalFormat("#.#").format(Average)+" Note: B Success");
        }
        else if (Average>50 && Average<=70){
            System.out.println("Average:"+new DecimalFormat("#.#").format(Average)+" Note: C Success");
        }else System.out.println("Average:"+new DecimalFormat("#.#").format(Average)+" Note: F Failed!");

    }
    public  static double calcAverage(int [] score){
        int total=0;
        for (int i=0;i<score.length;i++){
            if(score[i]>=0&&score[i]<=100){
                total+=score[i];
            }
        }
        double Average=total/score.length;
        return Average;

    }
    public static  int [] inputPoint() {
        int mat = 0;
        int kim = 0;
        int tr = 0;
        int eng = 0;

        Scanner noteInput = new Scanner(System.in);
        System.out.println("***Grade Point Average Calculator***");
        System.out.println("Your Math Grade :");
        mat=noteInput.nextInt();
        System.out.println("Your Chemical Grade :");
        kim=noteInput.nextInt();
        System.out.println("Your Turkish Grade :");
        tr=noteInput.nextInt();
        System.out.println("Your Engilsh Grade :");
        eng=noteInput.nextInt();
        int [] gradeNote={mat,kim,tr,eng};
        return gradeNote;
    }
}