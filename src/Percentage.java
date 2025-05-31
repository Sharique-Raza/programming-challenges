import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GRADE CALCULATOR");
        System.out.println("******************************");
        System.out.print("ENTER YOUR PERCENTAGE : ");
        float sub = sc.nextFloat();
        if (sub >= 90) {
            System.out.println(" YOUR GRADE IS A ");
        } else if (sub >= 75 && sub < 90) {
            System.out.println(" YOUR GRADE IS B ");
        } else if ( sub >= 60 && sub < 75) {
            System.out.println(" YOUR GRADE IS C ");
        } else if ( sub >= 30 && sub < 60) {
            System.out.println(" YOUR GRADE IS D ");
        } else {
            System.out.println(" YOUR GRADE IS E ");
        }

    }
}
