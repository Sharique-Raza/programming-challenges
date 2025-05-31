import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        System.out.println("WELCOME TO DRIVING LICENSE PORTAL");
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOOUR AGE : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println(" Cycle chalao Bacche!");
        }
    }
}
