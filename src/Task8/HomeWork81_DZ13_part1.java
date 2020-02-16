/*
1) Привести пример каждого из вышеперечисленным методов String и парочку методов StringBuilder

charAt,     contains, endsWith, startsWith, equals,    equalsIgnoreCase,
indexOf,   isEmpty, length, replace,  substring,
 toLowerCase,   toUpperCase, trim, toCharArray
*valueOf, format
*split
 */

package Task8;

import java.util.Arrays;

public class HomeWork81_DZ13_part1 {
    public static void main(String[] args) {
        String str = "Hello Java";
        //Method charAt
        char c = str.charAt(6);
        System.out.println("6й символ в строке: " + c);
        //Method contains
        boolean cont = str.contains("Java");
        System.out.println("Строка содержит слово \"Java\": " + cont);
        //Method endsWith и startsWith
        boolean start = str.startsWith("Hello");
        boolean end = str.endsWith("Java");
        boolean end2 = str.endsWith("World");
        System.out.println("Строка начинается с \"Hello\": " + start);
        System.out.println("и заканчивается на \"Java\": " + end);
        System.out.println("а может заканчивается на \"World\"?: " + end2);

        //Method equals и equalsIgnoreCase
        String str2 = "hello java";
        System.out.println("Строка1 соответствует строке2?: " + str.equals(str2));
        System.out.println("А если без учета регистра?: " + str.equalsIgnoreCase(str2));

        //Method indexOf и lastIndexOf
        System.out.println("Индекс символа 'l' в строке?: " + str.indexOf('l'));
        System.out.println("Индекс последнего символа 'l' в строке?: " + str.lastIndexOf('l'));

        //Method isEmpty
        System.out.println("Строка пустая?: " + str.isEmpty());

        //Method length
        System.out.println("Длинна строки: " + str.length());

        //Method replace
        System.out.println("Меняем приветствие: " + str.replace("Java", "World!"));

        //Method substring
        System.out.println(" С шестого символа до конца строки: " + str.substring(6));
        System.out.println("Символы с 3 по 5: " + str.substring(3, 5));

        //Method toLowerCase,   toUpperCase
        System.out.println("Приводим строку в нижний регистр: " + str.toLowerCase());
        System.out.println("и в верхний регистр: " + str.toUpperCase());

        //Method trim
        String str3 = "               " + str.concat("     ");
        System.out.println("Добавили в строку пробелов: " + str3);
        System.out.println("А теперь пробелы уберем: " + str3.trim());

        //Method toCharArray
        char[] arrChar = str.toCharArray();
        System.out.println("Массив из строки: " + Arrays.toString(arrChar));

        //Method *valueOf, format
        String str4 = String.valueOf(121.32);
        System.out.println(String.format("Преобразованный в строку double: %s" ,str4));

        //Method *split
        String[] arr = str.split("\\s+");
        System.out.println(Arrays.toString(arr));
    }
}
