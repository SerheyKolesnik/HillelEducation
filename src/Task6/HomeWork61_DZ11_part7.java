/*
7) Попросить пользователя ввести 3 числа типа int.
Вывести их среднее арифметическое.
 */
package Task6;

import java.util.Scanner;

public class HomeWork61_DZ11_part7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число: ");
            arr1[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            count++;
        }
        double average = (double) sum / count;
        System.out.printf("Среднее арифметическое введенных чисел: %s", average);
    }
}
