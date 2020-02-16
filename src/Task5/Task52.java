package Task5;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        int [] array1 =new int [5] ;
        Scanner s = new Scanner(System.in);
        FillArray(array1, s);
        ExtractArray(array1);
    }

    private static void ExtractArray(int[] array1) {
        for (int i = 0; i <= array1.length-1; i++) {
            System.out.print(array1[i] + " " );
        }
    }

    private static void FillArray(int[] array1, Scanner s) {
        System.out.println("Введите элемент массива, целое число: ");
        for (int i = 0; i <5 ; i++) {
            array1[i] = s.nextInt()*2;
        }
    }
}
