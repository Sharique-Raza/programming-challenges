import java.util.Scanner;

public class primeChecker {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("WELCOME TO PRIME NUMBER CHECKER ");
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("YOUR NUMBER IS " + ((isPrime) ? "PRIME" : "NOT PRIME"));
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++){
            if(num % i == 0) {
                return false;
            }
        }return true;
    }
}
