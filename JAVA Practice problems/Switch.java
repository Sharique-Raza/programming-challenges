import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to day of the week checker. ");
        System.out.print("Enter your day in number : ");
        int day = sc.nextInt();
        enhancedSwitch(day);

    }
    public static void oldSwitch(int day) {
        switch (day) {
            case 1 :
                System.out.println("MONDAY");
                break;
            case 2 :
                System.out.println("TUESDAY");
                break;
            case 3 :
                System.out.println("WEDNESDAY");
                break;
            case 4 :
                System.out.println("THURSDAY");
                break;
            case 5 :
                System.out.println("FRIDAY");
                break;
            case 6 :
                System.out.println("SATURDAY");
                break;
            case 7 :
                System.out.println("SUNDAY");
                break;
        }

    }
    public static void enhancedSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Holiday";
            default -> "Invalid";

        };
        System.out.println(dayStr);
    }

}

