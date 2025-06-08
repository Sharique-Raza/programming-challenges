import java.util.Scanner;

class circle {

    double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    double getCircumference() {
        return 2*Math.PI*radius;
    }
    double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius = " + radius + "mm"
                + " , Area = " + getArea()
                + " , Circumference = " + getCircumference();


    }

    public static void main(String[] args) {
        System.out.println("TO FIND THE AREA AND PERIMETER OF THE CIRCLE");
        System.out.print("Enter the radius in mm : ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        circle Circle = new circle(radius);
        System.out.println(Circle);
    }
}


