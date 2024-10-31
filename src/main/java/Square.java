public class Square extends AbstractShape {
    private double side;

    public Square(double side) {
        super("Persegi");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
