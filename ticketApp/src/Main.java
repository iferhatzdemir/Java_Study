import java.net.URI;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        priceCal(setInfo());
    }
    public static void priceCal(int [] userInfo){
        double kmPrice=0.10;
                double price=userInfo[1]*kmPrice;
        double returnSale=(price*20)/100;
        double kidsSale=(price*50)/100;
        double youngSale=(price*10)/100;
        double oldSale=(price*30)/100;

        if(userInfo[0]==1){ price-=returnSale;}
        if(userInfo[2]<12){price-=kidsSale;}
        else if(userInfo[2]>12&&userInfo[2]>24){price-=youngSale;}
        else if (userInfo[2]>65){price-=oldSale;}
        System.out.println("---------------------------------");
        System.out.println(new DecimalFormat("#.#").format(price)+"TL");
        System.out.println("\n \n");
        System.out.println("Would you like to buy a new ticket?");
        System.out.println("Y/N");
        String newTicket=scanner.next();
        newTicket=newTicket.toLowerCase(Locale.ROOT).substring(0,1);
        if (newTicket.equals("y")){
            priceCal(setInfo());
        }
    }
    public static int [] setInfo(){
        int [] usersInfo=new int[3];
        System.out.println("Welcome TicketApp");
        System.out.print("Select the ticket type.\nChoose \"Return: 1\" or \"One Way: 2\" : ");
        int type = scanner.nextInt();
        usersInfo[0]=type;
        System.out.print("Enter the distance in km : ");
       int distance = scanner.nextInt();
        usersInfo[1]=distance;
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        usersInfo[2]=age;
        return usersInfo;
    }
}
