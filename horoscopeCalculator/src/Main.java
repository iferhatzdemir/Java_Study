import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner inputs=new Scanner(System.in);
    public static Integer [] Mounths={1,2,3,4,5,6,7,8,9,10,11,12};
    public static String [] Horoscope={"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius",};
    public static void main(String[] args) {

        CalculateHoroscope(getInfo());


    }

    public static void  CalculateHoroscope(int [] getInfo){
        int month=getInfo[0];
        int day=getInfo[1];
        int monthIndex= Arrays.asList(Mounths).indexOf(month);
        if (day<20) System.out.println("Your Zodiac Sign: "+Arrays.toString(new String[]{Horoscope[monthIndex]}));
        if (day>=20) {
            monthIndex+=1;
        System.out.println("Your Zodiac Sign: "+Arrays.toString(new String[]{Horoscope[monthIndex]}));
        }



    }
    public static int [] getInfo(){
        int [] userInfo=new int[2];
        System.out.println("The month of birth must be entered as follows\n1 for January\n2 for February etc."); System.out.print("Enter your month of birth: ");
        userInfo[0]=inputs.nextInt();
        System.out.print("Enter your day of birth: ");
        userInfo[1]=inputs.nextInt();
        if (userInfo[1]<=0||userInfo[1]>31 ||userInfo[0]<=0||userInfo[0]>12){
            System.out.println("Try Again");
            getInfo();


        }

        return userInfo;
    }
}