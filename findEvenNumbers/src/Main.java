import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello ");
        Loops();
    }

    public static void evenFor(int numbersCount) {
        int forAverage = 0;
        int evenCounter = 0;
        for (int i = 1; i < numbersCount; i++) {
            if (i % 2 == 0) {

                forAverage += i;
                evenCounter++;
            }
        }
        System.out.println("For Loops:" + forAverage / evenCounter);
    }

    public static void evenWhile(int numbersCount) {
        int evenCounter = 0;
        int whileAverage = 0;
        int j = 1;
        while (j < numbersCount) {
            if (j % 2 == 0) {
                whileAverage += j;
                evenCounter++;

            } j++;
        }
        System.out.println("While Loops:" + whileAverage / evenCounter);
    }

    public static void evenDoWhile(int numbersCount) {
        int evenCounter = 0;
        int whileAverage = 0;
        int j = 1;
        do {
            if (j % 2 == 0) {
                whileAverage += j;
                evenCounter++;

            }  j++;
        }
        while (j < numbersCount);

        System.out.println("While Loops:" + whileAverage / evenCounter);
    }

    public static void threeFourFor(int numbersCount) {
        int forAverage = 0;
        int evenCounter = 0;
        for (int i = 1; i < numbersCount; i++) {
            if (i % 3 == 0 && i%4==0) {

                forAverage += i;
                evenCounter++;
            }
        }
        System.out.println("For Loops:" + forAverage / evenCounter);
    }

    public static void threeFourWhile(int numbersCount) {
        int evenCounter = 0;
        int whileAverage = 0;
        int j = 1;
        while (j < numbersCount) {
            if (j % 3 == 0 && j%4==0) {
                whileAverage += j;
                evenCounter++;

            } j++;
        }
        System.out.println("While Loops:" + whileAverage / evenCounter);
    }

    public static void threeFourDoWhile(int numbersCount) {
        int evenCounter = 0;
        int whileAverage = 0;
        int j = 1;
        do {
            if (j % 3 == 0 && j%4==0) {
                whileAverage += j;
                evenCounter++;

            }  j++;
        }
        while (j < numbersCount);

        System.out.println("While Loops:" + whileAverage / evenCounter);
    }


    public static void evenLoops(int numbersCount) {
        int forAverage = 0;
        int evenCounter = 0;
        System.out.println("For Loop: 1\nWhile Loop: 2\nDo-While:3");
        System.out.println("Choose Loop:");
        int loopChoose = scanner.nextInt();
        if (loopChoose == 1) evenFor(numbersCount);
        else if (loopChoose == 2) evenWhile(numbersCount);
        else if (loopChoose == 3) evenDoWhile(numbersCount);
        else System.out.println("Invalid Input:"+loopChoose);


    }

    public static void fourThreeDivisible(int numbersCount) {
        System.out.println("For Loop: 1\nWhile Loop: 2\nDo-While:3");
        System.out.println("Choose Loop:");
        int loopChoose = scanner.nextInt();
        if (loopChoose == 1) threeFourFor(numbersCount);
        else if (loopChoose == 2) threeFourWhile(numbersCount);
        else if (loopChoose == 3) threeFourDoWhile(numbersCount);
        else System.out.println("Invalid Input:"+loopChoose);

    }

    ;

    public static void Loops() {
        System.out.println("How Many Numbers to Search? :");
        int numbersCount = scanner.nextInt();
        System.out.println("Even Numbers Average:1");
        System.out.println("Average of numbers divisible by three and four:2");
        int choose = scanner.nextInt();
        if (choose == 1) evenLoops(numbersCount);
        else if (choose == 2) fourThreeDivisible(numbersCount);
        else {
            System.out.println("Invalid input:" + choose);
        }


    }
}