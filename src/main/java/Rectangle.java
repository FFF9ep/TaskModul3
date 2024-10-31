public class Rectangle extends AbstractShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Persegi Panjang");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
