import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME,SET YOUR PASSWORD");
        String password;
        do {
            System.out.print("Enter your password : ");
            password = sc.next();
        } while(!isvalidpass(password));
        System.out.println("Thanks entering a valid password");
    }
    public static boolean isvalidpass( String password) {
        return password.length() > 6;
    }
}
