public abstract class AbstractShape implements Shape, PerimeterCalculable {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    public void printArea() {
        System.out.println("Luas " + name + " adalah: " + calculateArea());
    }

    public void printPerimeter() {
        System.out.println("Keliling " + name + " adalah: " + calculatePerimeter());
    }
}
