import java.util.Random;
import java.util.Scanner;

class numGuess {
     static int gennum() {
        double Random  = Math.random() * 10;
        return (int) Math.ceil(Random);


    }

    public static void main(String[] args) {
        numGuess guess = new numGuess();
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        for(int i =0;i<10;i++) {
            System.out.print("Enter a number between 1-10 : ");
            int num = sc.nextInt();
            if(num == gennum()) {
                System.out.println("HURRAY,You guessed the right number");
            }else {
                System.out.println(" SORRY,TRY AGAIN");
            }
        }
    }


}
