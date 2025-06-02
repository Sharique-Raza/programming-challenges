import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE MULTIPLICATION WORLD");
        System.out.print("ENTER A NUMBER YOU WANT TO PRINT A TABLE OF IT : ");
        int num = sc.nextInt();
        System.out.println(" THE TABLE OF " + num + " IS SHOWN BELOW : ");
        multiplynum(num);
    }
    public static void multiplynum(int num) {
        int i = 1;
        while (i<=10) {
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }
    }
}
