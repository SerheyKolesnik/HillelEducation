/*
10) Вывести числа от 100 до 200 кратные 17
 */
package Task6;

import java.util.Random;
import java.util.Scanner;

public class HomeWork61_DZ11_part10 {
    public static void main(String[] args) {
        int[] multipleArray = new int[countMultiple(100, 200, 17)];
        fullMultiple(multipleArray);
        printArrayIntoString(multipleArray);
    }

    private static void fullMultiple(int[] multipleArray) {
        int i = 100;
        int j =0;
        while (i <= 200) {
            if (i % 17 == 0) {
                multipleArray[j] = i;
                j++;
            }
            i++;
        }
    }

    private static void printArrayIntoString(int[] evenArray) {
        System.out.println("Печатаем массив в строку: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.print("\n");
    }

    private static int countMultiple(int numBegin, int numEnd, int num) {
        int count = 0;
        int i = numBegin;
        while (i <= numEnd) {
            if (i % num == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}

