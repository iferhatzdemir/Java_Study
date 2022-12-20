import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        boolean isArmstrong=false;
        System.out.println("Enter a Number:");
        int  number=scanner.nextInt();
        String strNumber=Integer.toString(number);
        int numberLength=strNumber.length();
        String str;
        int intValue=0;
        int total=0;
        for (int i=0;i<numberLength;i++){
          str =strNumber.substring(i,i+1);
          intValue=Integer.parseInt(str);
          total+=Math.pow(intValue,numberLength);
        }

        if (total==number){
        isArmstrong=true;
        }else isArmstrong=false;
        if (isArmstrong) System.out.println("Number is Armstrong Number");
        else  System.out.println("Number is not Armstrong Number");
    }
}