/*
2) Попросить пользователя ввести ФИО (3 переменные).
Используя один оператор print() вывести в ФИО 3 строки ("\n").
 */

package Task6;

import java.util.Scanner;

public class HomeWork61_DZ11_part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String familyName = scanner.nextLine();
        System.out.println("Введите Имя: ");
        String firstName = scanner.nextLine();
        System.out.println("Введите Отчество: ");
        String secondName = scanner.nextLine();
        System.out.printf("Ваше полное имя:\n%s\n%s\n%s\n", familyName, firstName, secondName);
    }
}
