package Task5;

import java.util.Random;

public class Task54 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arr1 = new int [10];
        for (int i = 0; i <arr1.length-1; i++) {
            arr1[i] = random.nextInt(10);
        }
        for (int i = 0; i <arr1.length-1 ; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println(random.nextInt(5));
    }
}
