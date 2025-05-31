import java.util.Scanner;

public class ChallengeQ4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("AGE CALCULATOR");
            System.out.println("******************************");
            System.out.print("ENTER YOUR AGE : ");
            int age = sc.nextInt();
            if (age >= 60) {
                System.out.println(" YOU ARE A SENIOR ");
            } else if (age >= 60 && age < 90) {
                System.out.println(" YOUR GRADE IS B ");
            } else if ( age >= 20 && age < 60) {
                System.out.println(" YOU ARE A ADULT ");
            } else if ( age >= 13 && age <= 20) {
                System.out.println(" YOU ARE A TEEN ");
            } else {
                System.out.println(" YOU ARE A CHILD ");
            }

        }
    }


