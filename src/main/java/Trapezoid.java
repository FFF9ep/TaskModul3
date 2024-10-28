import java.util.Scanner;

/**
 * Kelas yang merepresentasikan bangun datar trapesium.
 */
class Trapezoid extends AbstractShape {
    private double base1;
    private double base2;
    private double height;
    private double sideA;
    private double sideB;

    /**
     * Konstruktor untuk kelas Trapezoid.
     *
     * @param base1  panjang alas pertama dari trapesium
     * @param base2  panjang alas kedua dari trapesium
     * @param height tinggi dari trapesium
     * @param sideA  panjang sisi miring pertama dari trapesium
     * @param sideB  panjang sisi miring kedua dari trapesium
     */
    public Trapezoid(double base1, double base2, double height, double sideA, double sideB) {
        super("Trapesium");
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * Menghitung luas trapesium.
     *
     * @return luas dari trapesium
     */
    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    /**
     * Menghitung keliling trapesium.
     *
     * @return keliling dari trapesium
     */
    @Override
    public double calculatePerimeter() {
        return base1 + base2 + sideA + sideB;
    }

    /**
     * Metode statis untuk membuat objek Trapezoid berdasarkan input pengguna.
     *
     * @param scanner objek Scanner untuk membaca input pengguna
     * @return objek Trapezoid yang telah dibuat
     */
    public static Trapezoid createTrapezoid(Scanner scanner) {
        ShapeParameters base1Param = new ShapeParameters("Masukkan panjang alas pertama: ");
        ShapeParameters base2Param = new ShapeParameters("Masukkan panjang alas kedua: ");
        ShapeParameters heightParam = new ShapeParameters("Masukkan tinggi trapesium: ");
        ShapeParameters sideAParam = new ShapeParameters("Masukkan panjang sisi miring pertama: ");
        ShapeParameters sideBParam = new ShapeParameters("Masukkan panjang sisi miring kedua: ");

        double base1 = base1Param.getValue(scanner);
        double base2 = base2Param.getValue(scanner);
        double height = heightParam.getValue(scanner);
        double sideA = sideAParam.getValue(scanner);
        double sideB = sideBParam.getValue(scanner);

        return new Trapezoid(base1, base2, height, sideA, sideB);
    }
}
