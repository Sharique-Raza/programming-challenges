import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        System.out.println("short hand operations");
        int a = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("EVERY NUMBER YOU PUT WILL BE ADD TO 10 and further AND SHOWED");
        int x1 = sc.nextInt();
        a += x1;
        System.out.println(a);
        int x2 = sc.nextInt();
        a += x2;
        System.out.println(a);
        int x3 = sc.nextInt();
        a += x3;
        System.out.println(a);
        System.out.println("END");
    }
}