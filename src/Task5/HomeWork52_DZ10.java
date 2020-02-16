/*
Домашнее задание 10
Добавлено: 08.01.2020 22:38

Дз5.2
Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку.
Определить и вывести на экран сообщение о том,
является ли массив строго возрастающей последовательностью.

*У вас есть 50 специальных программ для кибератак.
Они пронумерованы от 1 до 50.
Атакуя сайт китайской разведки вы хотите каждый раз запускать программы в случайном порядке,
 чтобы противник не смог заранее подготовиться.
 Напишите функцию, которая будет создавать массив с номерами запускаемых программ.
 Номера в массиве не должны повторяться и должны расставляться каждый раз в случайном порядке.

*Задан массив целых чисел. Поместить все нули в начало массива.
Например дано {х,х,0,х,0,х}, в результате получаем {0,0,х,х,х,х}, порядок ненулевых чисел значения не имеет.
 */

package Task5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork52_DZ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr1 = new int[4];
        fullArray(random, arr1, 10, 99);
        printArrayIntoString(arr1);
        checkAscendingSequence(arr1);
    }

    private static void checkAscendingSequence(int[] arr1) {
        boolean result = true;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i - 1] > arr1[i]) {
                result = false;
            }
        }
        if (result) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

    private static void fullArray(Random random, int[] arr1, int firstNum, int lastNum) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt((lastNum - firstNum)) + firstNum;
        }
    }

    private static void printArrayIntoString(int[] evenArray) {
        System.out.println("Печатаем массив в строку: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.print("\n\n");
    }
}
