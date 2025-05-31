import java.util.Scanner;

public class ChallengeQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  TO FIND WHETHER A NO. IS POSITUVE , NEGATIVE OR ZERO ");
        System.out.println("***********************************************************");
        System.out.println(" ENTER YOUR NUMBER ");
        int num = sc.nextInt();
        if (num >= 1) {
            System.out.println(" ENTERED NUMBER IS POSITIVE ");
        } else if (num == 0) {
            System.out.println(" ENTERED NUMBER IS ZERO ");

        } else {
            System.out.println(" ENTERED NUMBER IS NEGATIVE");
        }

    }
}