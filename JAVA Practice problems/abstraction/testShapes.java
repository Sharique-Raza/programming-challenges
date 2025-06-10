package abstraction;

public class testShapes {
    public static void main(String[] args) {
        circle Circle = new circle(5.2);
        Sqaure sqaure = new Sqaure(12);
        System.out.println("THE AREA OF THE CIRCLE IS : " + Circle.calculateArea());
        System.out.println("THE AREA OF THE SQUARE IS : " + sqaure.calculateArea());
    }
}
