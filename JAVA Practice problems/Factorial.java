import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" WELCOME TO FACTORIAL CALCULATOR : ");
        int fac = sc.nextInt();
        long fact = factorial(fac);
        System.out.println(" Factorial is : " + fact);
    }
    public static long factorial(int fac) {
        if (fac < 2) {
            return 1;
        }
       long fact = 1;
        int i = 2;
        while(i <= fac) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
