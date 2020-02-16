package Task4;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num1 = scanner.nextInt();
        int num2=num1;
        int count=0;
        while (num2>0){
            num2=num2/10;
            count += 1;
        }
    }
}
