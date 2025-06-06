import java.util.Scanner;

public class calcbySwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE CALCULATOR");
		System.out.print("ENTER YOUR FIRST NUMBER : ");
		int num1 = sc.nextInt();
		System.out.print("ENTER YOUR SECOND NUMBER : ");
		int num2 = sc.nextInt();
		System.out.println("ENTER YOUR OPERATION (+,-,*,/) ");
		String op = sc.next();
		int result = switch (op) {
		  case "+" -> num1 + num2;
		  case "-" -> num1 - num2;
		  case "*" -> num1 * num2;
		  case "/" -> num1 / num2;
		  default -> 0;
		};
		System.out.println("Your result is " + result);

	}
}