/*
12*) Задать массив из 10 случайных чисел, и вывеcти минимальный элемент массива и его индекс.
 */

package Task6;

import java.util.Random;

public class HomeWork61_DZ11_part12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        fullArray(random, arr1, 1, 100);
        printArrayIntoString(arr1);
        int minItemArr = arr1[0];
        int minItem = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (minItemArr > arr1[i]) {
                minItemArr = arr1[i];
                minItem = i;
            }
        }
        System.out.printf("Минимальный элемент массива:\nиндекс: %s\nзначение %s\n", minItem, minItemArr);
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
