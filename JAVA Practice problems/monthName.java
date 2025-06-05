import java.util.Scanner;

public class monthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO FIND THE MONTH NAME");
        System.out.print("ENTER YOUR MONTH IN NUMBER : ");
        int num = sc.nextInt();
        monthName name = new monthName();
        name.month(num);

    }
    public void month(int num) {
        String monthName = switch (num) {
            case 1 -> "JANUARY";
            case 2 -> "FEBUARY";
            case 3 -> "MARCH";
            case 4 -> "APRIL";
            case 5 -> "MAY";
            case 6 -> "JUNE";
            case 7 -> "JULY";
            case 8 -> "AUGUST";
            case 9 -> "SEPTEMBER";
            case 10 -> "OCTOBER";
            case 11 -> "NOVEMBER";
            case 12 -> "DECEMBER";
            default -> "INVALID NUMBER";
        };
        System.out.println(monthName);
    }
}

