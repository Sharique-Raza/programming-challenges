import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(" YOUR ENTERED YEAR IS A LEAP YEAR ");
        } else {
            System.out.println(" YOUR ENTERED YEAR IS NOT A LEAP YEAR ");
        }
    }
}
