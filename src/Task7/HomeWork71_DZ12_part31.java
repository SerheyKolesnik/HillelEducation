/*
3*) Написать метод которому передаются массив и 2 числа a,b.
Метод должен вывести в 1 строку элементы массива между индексами a и b включая a и не включая b.
Если индексы не в пределах массива то вместо массива напечатать об этом.
Например если массив на 10 элементов и a=0, b=10 то метод выведет весь массив,
а при a=0, b=3 первые 3 элемента - 0, 1, 2.
 */
package Task7;

public class HomeWork71_DZ12_part31 {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] arr = {25,18,26,39,65,68,42,2,0,87};
        int a = 0;
        int b = 3;
        printArray(a, b, arr);
    }

    private static void printArray(int a, int b, int[] arr) {
        for (int i = a; i < b; i++) {
            if (b < arr.length) {
                System.out.print(arr[i] + "   ");
            } else {
                System.out.println("Ошибка! Вы ввели неверные входные данные.");
                break;
            }
        }
    }
}
