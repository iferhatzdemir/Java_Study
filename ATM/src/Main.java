import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static String userName = "admin";
    public static String password = "admin";
    public static int right = 3;
    public static double balance=0;



    public static void main(String[] args) {
    login();
    }
    public static void againProcces(){
        System.out.println("Would you like to trade again?");
        System.out.println("Y/N");
        String str=scanner.next();
        str.toLowerCase().substring(0,1);
        if (str.equals("y")){
            chooseProcess();
        }else {
            System.out.println("Good Bye");
            System.out.println("-----------------------------");
            login();
        }
    }
    public static void deposit( ){
        String str="Please Enter the Amount you wish to deposit:";
        System.out.println(str.toUpperCase());
        int deposit=scanner.nextInt();
        balance+=deposit;
        System.out.println("New Balance= "+balance);
        againProcces();

    };
    public static void withdrawal(){
        System.out.println("Enter the amount you want to withdraw:");
        int withdrawal=scanner.nextInt();
        balance-=withdrawal;
        System.out.println("New Balance= "+balance);
        againProcces();
    };
    public static void balanceInquiry( ){
        System.out.println("Your's Balance:"+balance);
        againProcces();
    };
    public static void chooseProcess() {
        System.out.printf("Welcome %s",userName);
        System.out.println("Please choose the action you would like to perform:");
        System.out.println("1-make a deposit\n2-Withdrawal\n3-Balance Inquiry\n4-Exit");
        System.out.printf("Your's Choose:");
        int proChoose=scanner.nextInt();
        switch (proChoose){
            case 1:deposit();
            break;
            case 2:withdrawal();
            break;
            case 3 :balanceInquiry();
            break;
            case 4:System.out.println("Good Bye");
                System.out.println("--------------------------");login();
            break;
            default:
                System.out.println("Invalid Choose");
                System.out.println("Plase Try Again");
        }

    }

    public static void login() {

        System.out.println("Welcome Java Bank");
        System.out.println("Username");
        String inpUsername = scanner.next();
        System.out.println("Password");
        String inpPass = scanner.next();
        if (inpPass.equals(password) && inpUsername.equals(userName)) {
            chooseProcess();

        } else if (right > 0) {

            System.out.println("your remaining right:" + right);right--;
            login();

        } else {
            System.out.println("your dont have right");
            System.out.println("Your account has been blocked, please contact the bank.");
            System.out.println("Good Bye");
        }
    }

}