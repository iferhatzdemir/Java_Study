import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public  static String username;

    public static String password;
    public static String [] current={"admin","admin"};

    public static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        check(login());


    }


    public static String [] login(){
        System.out.println("Welcome");
        System.out.println("--------------------------");
        System.out.printf("Username:");
        username=input.next();
        System.out.printf("Password:");
        password=input.next();

        String [] inputs;
        inputs = new String[]{username, password};
        return inputs;
    }

    public static void check(String [] inputs){


        username=inputs[0];
        String curUsername=current[0];
        String curPassword=current[1];
        password=inputs[1];
        if(username.equals(curUsername)&& password.equals(curPassword)){
            System.out.println("Login Successful!");

        }else if (!username.equals(curUsername)){
            System.out.println("Username Failed, Try Again");
            check(login());

        }else {
            System.out.println("Password Failed, Try Again");

            System.out.println("Would you like to reset your password?");
            System.out.println("Y/N");
            String answer=input.next().substring(0,1).toLowerCase();
            switch (answer){
                case "y":
                    resetPassword();
                    break;
                case "n":
                    System.out.println("E -> Exit T-> Try Agin Press");
                    String process=input.next().substring(0,1).toLowerCase();
                    switch (process){
                        case "e":break;
                        case "t":check(login());break;
                    }
                    break;
            }

        }

    }
    public static void resetPassword(){
        System.out.println("Enter New Password:");
        String newPass=input.next();
        System.out.println("ConfirimPassword:");
        String confPass=input.next();

        if (newPass.equals(confPass)){
            System.out.println("Success!");
            current[1]=newPass;
            System.out.println(Arrays.toString(current));
            check(login());
        }else{
            System.out.println("passwords do not match! ");
            resetPassword();
        }
    }
}
