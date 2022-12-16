import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String grade=gradeIput();
        switch (grade){
            case "A":
                System.out.println("pekiyi");
                break;
            case "B":
                System.out.println("iyi");
                break;
            case "C":
                System.out.println("Kaldınız");break;
            default:System.out.println("Geçersiz");
        }
    }
    public static String gradeIput(){
        Scanner strInp=new Scanner(System.in);
        String not=strInp.nextLine();

        return not;
    }
}