public class Add$overload {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int x, int y, int z) {
        return x + y + z;
    }
    public double add(double p, double q) {
        return p + q;
    }

    public static void main(String[] args) {
        Add$overload calc = new Add$overload();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(5,6,9));
        System.out.println(calc.add(7.85,6.35));
    }
}
