import java.util.Scanner;

public class CalcLoop {
    public static void main(String[] args) {
        greet();
        int first = readNum();
        int sec = readNum();
        int sum = first + sec;
        System.out.println("THE SUM OF YOUR NUMBER IS : " + sum);

    }
    public static int readNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER : ");
        int num1 = sc.nextInt();
        return num1;
    }
    public static void greet() {
        System.out.println("WELCOME TO THE CALCULATOR");
    }
}
