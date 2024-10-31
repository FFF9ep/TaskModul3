import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        // Loop untuk menjalankan program hingga pengguna memilih untuk berhenti
        while (continueProgram) {
            showMenu();
            int choice = scanner.nextInt();
            handleUserChoice(choice, scanner);

            // Tanyakan apakah ingin mengulangi atau keluar
            continueProgram = askToContinue(scanner);
        }

        scanner.close();
        System.out.println("Terima kasih telah menggunakan program ini.");
    }

    public static void showMenu() {
        System.out.println("Pilih bangun datar:");
        System.out.println(Constants.PERSEGI + ". Persegi");
        System.out.println(Constants.PERSEGI_PANJANG + ". Persegi Panjang");
        System.out.println(Constants.SEGITIGA + ". Segitiga");
        System.out.println(Constants.LINGKARAN + ". Lingkaran");
        System.out.println(Constants.TRAPESIUM + ". Trapesium");
        System.out.print("Masukkan pilihan Anda: ");
    }

    public static void handleUserChoice(int choice, Scanner scanner) {
        Shape shape = null;
        switch (choice) {
            case Constants.PERSEGI:
                shape = createSquare(scanner);
                break;
            case Constants.PERSEGI_PANJANG:
                shape = createRectangle(scanner);
                break;
            case Constants.SEGITIGA:
                shape = Triangle.createTriangle(scanner);
                break;
            case Constants.LINGKARAN:
                shape = Circle.createCircle(scanner);
                break;
            case Constants.TRAPESIUM:
                shape = Trapezoid.createTrapezoid(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        shape.printArea();
        if (shape instanceof PerimeterCalculable) {
            ((PerimeterCalculable) shape).printPerimeter();
        }
    }

    public static Square createSquare(Scanner scanner) {
        ShapeParameters sideParam = new ShapeParameters("Masukkan panjang sisi persegi: ");
        double side = sideParam.getValue(scanner);
        return new Square(side);
    }

    public static Rectangle createRectangle(Scanner scanner) {
        ShapeParameters lengthParam = new ShapeParameters("Masukkan panjang persegi panjang: ");
        ShapeParameters widthParam = new ShapeParameters("Masukkan lebar persegi panjang: ");
        double length = lengthParam.getValue(scanner);
        double width = widthParam.getValue(scanner);
        return new Rectangle(length, width);
    }

    public static boolean askToContinue(Scanner scanner) {
        System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
        String response = scanner.next();
        return response.equalsIgnoreCase("ya");
    }
}
