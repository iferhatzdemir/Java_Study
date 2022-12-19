import java.util.Scanner;

public class Main {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        suggestActivity(getTemp());
    }
    public static void suggestActivity( int temp){
        String str = null;
        if (temp>25){
            str="swim";
        }else if(temp>15 &&temp<=25){
            str="Picnic";

        }else if(temp>5&&temp<=15){
            str="Cinema";

        }else if(temp<=5){
            str="ski";

        }
        System.out.println("My suggestion to you: "+str);
    }
    public static int getTemp(){
        System.out.println("Welcome");
        System.out.println("How many degrees is it today?");
        int temp=input.nextInt();
        return temp;
    }

}