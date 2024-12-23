import java.util.Scanner;

public class InputMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст a: ");
        String a = scanner.nextLine();

        System.out.print("Введите текст b: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Текст a соответсвует тексту b");
        } else {
            System.out.println("Текст а не соответствует тексту b");
        }
    }
}
