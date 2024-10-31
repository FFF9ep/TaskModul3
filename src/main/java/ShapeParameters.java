import java.util.Scanner;

public class ShapeParameters {
    private String prompt;
    private double value;

    public ShapeParameters(String prompt) {
        this.prompt = prompt;
    }

    public double getValue(Scanner scanner) {
        System.out.print(prompt);
        value = scanner.nextDouble();
        return value;
    }
}
