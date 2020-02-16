/*
3) Попросить пользователя ввести месяц.
Используя оператор switch вывести какая это пора года, или сказать что месяц введен с ошибкой.
 */
package Task6;

import java.util.Scanner;

public class HomeWork61_DZ11_part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц (полное название с маленькой буквы): ");
        String monthName = scanner.nextLine();
        String Season;
        switch (monthName) {
            case "январь":
                Season = "Зима";
                break;
            case "февраль":
                Season = "Зима";
                break;
            case "март":
                Season = "Весна";
                break;
            case "апрель":
                Season = "Весна";
                break;
            case "май":
                Season = "Весна";
                break;
            case "июнь":
                Season = "Лето";
                break;
            case "июль":
                Season = "Лето";
                break;
            case "август":
                Season = "Лето";
                break;
            case "сентябрь":
                Season = "Осень";
                break;
            case "октябрь":
                Season = "Осень";
                break;
            case "ноябрь":
                Season = "Осень";
                break;
            case "декабрь":
                Season = "Зима";
                break;
            default:
                Season = "mistake";
                break;
        }
        if (Season == "mistake") {
            System.out.println("ОШИБКА!!!\nНеверно введен месяц.\nВведите полное название месяца" +
                    "\nна русском языке с маленькой буквы.");
        } else {
            System.out.println("Пора года, \nсоответствующая введенному месяцу: " + Season);
        }
    }
}
