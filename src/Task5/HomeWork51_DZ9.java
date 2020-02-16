/*
Домашнее задание 9
Добавлено: 08.01.2020 22:35

Дз5.1
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на
экран сначала в строку, отделяя один элемент от другого пробелом,
а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.

*Создайте массив из 8 случайных целых чисел из отрезка [1;10].
Выведите массив на экран в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на экран на отдельной строке.
 */

package Task5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork51_DZ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] evenArray = new int[countEven(2, 20)];
        int[] arr1 = new int[8];
        formArrayEven(evenArray);
        printArrayIntoString(evenArray);
        printArrayIntoColumn(evenArray);
        fullArray(random, arr1, 1, 10);
        printArrayIntoString(arr1);
        oddToZero(arr1);
        printArrayIntoString(arr1);
    }

    private static void oddToZero(int[] arr1) {
        System.out.println("Изменяем нечетные индексы на ноль: ");
        for (int i = 0; i < arr1.length; i++) {
            if (i % 2 == 0) {
                arr1[i] = 0;
            }
        }
    }

    private static void printArrayIntoColumn(int[] evenArray) {
        System.out.println("Печатаем массив в столбец: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.println(evenArray[i]);
        }
        System.out.print("\n");
    }

    private static void printArrayIntoString(int[] evenArray) {
        System.out.println("Печатаем массив в строку: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.print("\n\n");
    }

    private static void formArrayEven(int[] evenArray) {
        for (int i = 0; i <= countEven(2, 20) - 1; i++) {
            evenArray[i] = (i + 1) * 2;
        }
    }

    private static int countEven(int numBegin, int numEnd) {
        int count = 0;
        int i = numBegin;
        while (i <= numEnd) {
            if (i % 2 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

    private static void fullArray(Random random, int[] arr1, int firstNum, int lastNum) {
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = random.nextInt((lastNum-firstNum)) + firstNum;
        }
    }
}
