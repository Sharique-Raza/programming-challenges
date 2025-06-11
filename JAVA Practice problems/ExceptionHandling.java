import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE CALCULATOR ");
        System.out.print("Please enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Please enter the second number : ");
        int second = sc .nextInt();
        try {
            int result = first/second;
            System.out.printf("Result is %d",result);
        } catch (ArithmeticException excep) {
            if(excep.getMessage().equals("/ by zero")) {
                System.out.println("DIVIDED BY ZERO , ERROR OCCURED.");
            } else {
                throw excep;
            }
        }
    }
}
