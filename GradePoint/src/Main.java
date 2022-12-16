import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     int[] notes=inputPoint();
     boolean resultIsPass=calculatePass(notes);
     String result=(resultIsPass==true)?"You Passed":"You failed";
     System.out.println(result);
    }

    public static boolean calculatePass(int [] notes){
        boolean isPass=true;int total=0;int counter=notes.length;

        for (int i=0;i<notes.length;i++){

            total+=notes[i];
        }
        float avarge=(total/counter);
        isPass=(avarge>50)?true:false;
        return isPass;
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
