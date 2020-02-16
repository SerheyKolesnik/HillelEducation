/*
2) Написать метод в который можно передать неопределенное число типа int,
 а метод вернет среднее арифметическое, например int avg = average(1,2,3,4,5);
 */

package Task8;

public class HomeWork81_DZ13_part2 {
    public static void main(String[] args) {
        int avg = average(1, 2, 3, 4, 5);
        System.out.printf("Среднее: %s", avg);
    }

    public static int average(int... params) {
        int sum = 0;
        int count = 0;
        for (int value : params) {
            sum += value;
            count++;
        }
        return sum / count;
    }
}
