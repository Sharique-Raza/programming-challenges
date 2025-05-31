import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO FIND THE PERIMETER OF A RECTANGLE");
        System.out.println("**************************************");
        System.out.println("ENTER THE LENGTH IN METRE");
        int l = sc.nextInt();
        System.out.println("ENTER THE BREADTH IN METRE");
        int b = sc.nextInt();
        System.out.println("Calculating the perimeter.....");
        int p = 2*(l+b);
        System.out.println(" The perimeter of a rectangle is : " + p );

    }
}