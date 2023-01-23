import java.util.Scanner;

public class Main {
    public static double equation(double a, double b) {
        return b / a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Первый вариант
        System.out.println("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = scanner . nextDouble();
        System.out.println(equation(a,b));
        // Второй вариант
        System.out.println("Введите число a, затем b: ");
        System.out.println(1 / scanner.nextDouble() * scanner.nextDouble());

    }
}
