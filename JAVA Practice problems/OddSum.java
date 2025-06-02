import java.util.Scanner;

public  class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WEKCOME TO THE ODD SUM ");
        System.out.print("ENTER YOUR NUMBER : ");
        int num = sc.nextInt();
        int sum = oddsum(num);
        System.out.println(" Oddsum til " + num + " is : " + sum);

    }
    public static int oddsum(int num) {
        int sum = 0;
        int i = 1;
        while (i<= num) {
            sum += i;
           i += 2;
        }
        return sum;
    }
}