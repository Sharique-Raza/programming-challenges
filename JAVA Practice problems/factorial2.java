import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" WELCOME TO FACTORIAL CALCULATOR : ");
        int fac = sc.nextInt();
        long fact = factorial2(fac);
        System.out.print(" Factorial is : " + fact);
    }

    public static long factorial2(int fac) {
        if(fac == 1) {
            return 1;
        }
        return fac * factorial2(fac -1);
    }
}
