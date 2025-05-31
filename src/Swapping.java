import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SWAPPING TWO NUMBERS");
        System.out.print("Please enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Now enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Swapping done.....");
        int c = a;
        a = b;
        b = c;
        System.out.println(" Value of first number is : " + a );
        System.out.println(" Value of second number is : " + b);




    }
}
