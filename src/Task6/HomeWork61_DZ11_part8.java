/*
8) Просмотреть методы Math:
https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
Пользователь вводит 2 катета прямоугольного треугольника. Найти гипотенузу.
 */
package Task6;

import java.util.Scanner;

public class HomeWork61_DZ11_part8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый катет: ");
        int catet1 = scanner.nextInt();
        System.out.println("Введите второй катет: ");
        int catet2 = scanner.nextInt();
        System.out.printf("Гипотенуза введенных катетов равна: %s", Math.hypot(catet1, catet2));
    }
}
