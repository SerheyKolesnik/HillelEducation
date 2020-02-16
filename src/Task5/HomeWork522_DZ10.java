/*
Задан массив целых чисел. Поместить все нули в начало массива.
Например дано {х,х,0,х,0,х}, в результате получаем {0,0,х,х,х,х}, порядок ненулевых чисел значения не имеет.
 */
package Task5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork522_DZ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr1 = new int[4];
        FullArray(random, arr1, 10, 99);
    }
    private static void FullArray(Random random, int[] arr1, int firstNum, int lastNum) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt((lastNum - firstNum)) + firstNum;
        }
    }
}
