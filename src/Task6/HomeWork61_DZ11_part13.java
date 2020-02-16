/*
13*) Написать метод который возвращает среднее арифметическое массива который передан как параметр.

Напрмер:
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println("Average: " + average(arr));
}
private static double average(int[] arr) {
    // ...
    return ...;
}
 */
package Task6;

public class HomeWork61_DZ11_part13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Average: " + average(arr));
    }

    private static double average(int[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return sum / count;
    }
}
