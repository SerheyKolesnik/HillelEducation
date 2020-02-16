/*
9) Пользователь вводит 2 числа a,b. Вывести целое случайное число в диапазоне a..b включительно
 */
package Task6;

import java.util.Random;
import java.util.Scanner;

public class HomeWork61_DZ11_part9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите первое число диапазона: ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число диапазона: ");
        int lastNum = scanner.nextInt();
        int randomNum = random.nextInt((lastNum - firstNum)) + firstNum;
        System.out.printf("Случайное число из диапазона: %s",randomNum);
    }
}
