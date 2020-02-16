/*
11) Заполнить массив из 10 элементов по убыванию: первый элемент = 10, второй 9, итд.
 */
package Task6;

public class HomeWork61_DZ11_part11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 10;
        int j = 0;
        while (i > 0) {
            arr[j] = i;
            i--;
            j++;
        }
        printArrayIntoString(arr);
    }

    private static void printArrayIntoString(int[] evenArray) {
        System.out.println("Печатаем массив в строку: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.print("\n");
    }
}
