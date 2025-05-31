import java.util.Scanner;

public class ChallengeQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number : ");
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the greatest number among all three of them");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the greatest among all three of them ");
        } else {
            System.out.println(num3 + " is the the greatest among all three of them");
        }
    }
}
