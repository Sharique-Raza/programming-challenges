import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        int num = 5, guess;
        do {
            System.out.print("ENTER YOUR GUESSED NUMBER : ");
            guess = sc.nextInt();
            System.out.println("Wrong try again.");
        } while(num != guess);
        System.out.println("Huray! you guessed the right number");
    }
}
