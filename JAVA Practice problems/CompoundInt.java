import java.util.Scanner;

public class CompoundInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO FIND THE COMPOUND INTEREST ");
        System.out.print(" PLEASE ENTER THE PRINCIPAL AMOUNT : ");
        int p = sc.nextInt();
        System.out.print(" PLEASE ENTER THE RATE OF INTEREST : ");
        int r = sc.nextInt();
        System.out.print(" PLEASE ENTER THE TIME PERIOD : ");
        int t = sc.nextInt();
        System.out.println("Calculating the compound interest.......");
        double ci = p*(1+r/100)*t;
        System.out.println("THE CI OF YOUR ENTERED AMOUNT,RATE OF INTEREST AND TIME IS : " + ci );
    }
}
