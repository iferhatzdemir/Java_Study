import java.util.Scanner;

class Main{


    public static void main(String[] args) {
        int [] numbers = new int[15];
        for(int i = 0; i < 10; i++){
            numbers[i]=i+1*10;
        }
        for (int i:numbers){
            System.out.println(numbers[i]);
        }
    }

    }
