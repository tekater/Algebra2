import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a * x = b");
        System.out.println(" ");
        System.out.println("Введите число a:");// 5
        double a = scanner.nextDouble();
        System.out.println("Введите число b:");// 3
        double b = scanner.nextDouble();
        System.out.println(a+ " * x = " + b);
        System.out.println(" ");
        double x = (b / a);
        System.out.println("x=" + x);
        System.out.println(" ");
    }
}
