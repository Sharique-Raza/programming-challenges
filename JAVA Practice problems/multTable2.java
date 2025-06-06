import java.util.Scanner;

public class multTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE MULTIPLICATION WORLD");
        System.out.print("ENTER A NUMBER YOU WANT TO PRINT A TABLE OF IT : ");
        int num = sc.nextInt();
        System.out.println(" THE TABLE OF " + num + " IS SHOWN BELOW : ");
        multiplynum(num);
    }
    public static void multiplynum(int num) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num + " x " + i + " = " + num*i);

        }
    }
}
