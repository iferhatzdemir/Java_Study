import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        calcPalindrome(121);
    }
     static int input(){

         System.out.println("Hello");
         System.out.println("Enter a number for Palindrome Number");
         int inp=scanner.nextInt();
         return inp;
    }
    static void calcPalindrome(int inp){
        String Palindrome=Integer.toString(inp);
        StringBuffer a = new StringBuffer(Palindrome);
        String PalindromeRevers= String.valueOf(a.reverse());
        System.out.println(PalindromeRevers);
        boolean isPalindrome=false;
            if (Palindrome.equals(PalindromeRevers)){
                isPalindrome=true;
            } else{
                isPalindrome=false;

            }


        if (isPalindrome){
            System.out.println(inp+" is Palindrome Number");
        } else{
            System.out.println(inp+" is not Palindrome Number");
        }
    }
}