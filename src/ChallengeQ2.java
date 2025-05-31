import java.util.Scanner;

public class ChallengeQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  TO FIND WHETHER A NO. IS EVEN OR ODD ");
        System.out.println("***********************************************************");
        System.out.println(" ENTER YOUR NUMBER ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(" ENTERED NUMBER IS even ");
        }  else {
            System.out.println(" ENTERED NUMBER IS odd");
        }

    }

}
