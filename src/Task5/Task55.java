package Task5;

import java.util.Random;

public class Task55 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1 = new int[10];
        FullArray(random, arr1);
        int maxValue = arr1[0];
        int minValue = arr1[0];
        int iMax = 0;
        int iMin = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
            if (maxValue < arr1[i]) {
                maxValue = arr1[i];
                iMax = i;
            }
            if (minValue > arr1[i]) {
                minValue = arr1[i];
                iMin = i;
            }
        }
        System.out.println("\nMax: " + maxValue + " Min: " + minValue + " Index Max: " + iMax + " Index Min: " + iMin);
    }

    private static void FullArray(Random random, int[] arr1) {
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = random.nextInt(20) - 10;
        }
    }
}
