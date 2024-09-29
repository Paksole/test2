import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор 3.0!");
        System.out.println("Test1");
        System.out.println("Test2");
        System.out.println("Test3");
        System.out.println("Test4");
        System.out.println("Test5");
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int operand1 = scanner.nextInt(); //считывает число
        System.out.println("Введние операцию:");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число:");
        int operand2 = scanner.nextInt();

        System.out.println("Результат:");
        switch (operation) {
            case ('+'):
                System.out.println(operand1 + operand2);
                break;
            case ('-'):
                System.out.println(operand1 - operand2);
                break;
            case ('*'):
                System.out.println(operand1 * operand2);
                break;
            case ('/'): {
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на ноль");
                    break;
                } else {
                    System.out.println(operand1 / operand2);
                    break;
                }
            }
        }
    }
}