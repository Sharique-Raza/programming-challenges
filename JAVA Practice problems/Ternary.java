import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO FIND THE ABSOLUTE VALUE OF INTEGER");
        System.out.print("ENTER YOUR INTEGER : ");
        int num = sc.nextInt();
        int modulas = num >= 0 ? num : -num;
        System.out.println(" Absolute value of " + num + " is " + modulas);
    }
}

