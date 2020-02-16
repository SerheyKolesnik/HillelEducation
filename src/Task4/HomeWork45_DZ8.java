/*
Дз4.5
Условия задачи:
Вывести на экран фигуру (елочка)
Пример:
Введите размер елочки:
10
 */
package Task4;

import java.util.Scanner;

public class HomeWork45_DZ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту елочки:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 + 1; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < n - i; l++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
