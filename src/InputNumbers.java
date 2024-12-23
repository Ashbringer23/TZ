import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.print("Введите одну из операций (+ - * /): ");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("Результат сложения " + a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println("Результат вычитания " + a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println("Результат умножения " + a + " * " + b + " = " + (a * b));
                break;
            case "/":
                if (a != 0 || b != 0) {
                    System.out.println("Результат деления " + a + " / " + b + " = " + ((double) a / b));
                } else {
                    System.out.println("На 0 делить нельзя");
                }
                break;
            default:
                System.out.println("Введен не допустимый символ");
        }
    }
}
