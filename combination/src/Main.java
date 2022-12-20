import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("For the combination, enter the size of the unit and the number of items to be combined.");
        System.out.println("Unit size:");
        int unitSize = scanner.nextInt();
        System.out.println("Combineted item size:");
        int combinetedItemSize = scanner.nextInt();
        int nfactorial=1;
        for(int i=1;i<unitSize+1;i++) nfactorial *= i;
        int rfactorial=1;
        for(int i=1;i<combinetedItemSize+1;i++) rfactorial *= i;
        int nrfactoriel=1;
        int nrfactorial=1;
        for(int i=1;i<unitSize-combinetedItemSize;i++) nrfactorial *= i;

        int combination=nfactorial/(rfactorial*nrfactorial);
        System.out.println("Result:"+combination);
    }
}