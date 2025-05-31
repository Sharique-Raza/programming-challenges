import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        System.out.println("WELCOME TO TICKET DISCOUNT CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR AGE : ");
        int age = sc.nextInt();
        System.out.println("Are you a female ? (true/false) ");
        boolean isFemale = sc.nextBoolean();
        if (age < 5) {
            System.out.println(" YOU GOT 75% DISCOUNT ");
        } else if (isFemale) {
            System.out.println(" YOU GOT 50% DISCOUNT ");
        } else if (age > 60 && isFemale) {
            System.out.println("YOU GOT 25% DISCOUNT ");

            } else {
            System.out.println(" YOU GET NO DISCOUNT,SORRY!");
        }

    }
}
