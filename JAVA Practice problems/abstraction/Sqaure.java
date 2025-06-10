package abstraction;

public class Sqaure extends Shape {
    private double side;

    public Sqaure(double side) {
        this.side = side;

    }

    public double getLength() {
        return side;
    }


    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
