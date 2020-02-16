/*
5) Попросить пользователя ввести 2 числа.
Используя тернарный оператор ( ?: ) вывести меньшее из них.
 */
package Task6;

import java.util.Scanner;

public class HomeWork61_DZ11_part5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Меньшее число: " + ((num1 < num2) ? num1 : num2));
    }
}
