/*
3) Написать метод. Входящий параметр String separator.
Метод должен вернуть строку в которой все числа от 1 до 10 через separator.
Например если separator = "+" то результат будет "1+2+3..."
 */

package Task8;

public class HomeWork81_DZ13_part3 {
    public static void main(String[] args) {
        System.out.println(digitJoin("+"));
    }

    public static String digitJoin(String separator) {
        String str = "1";
        for (int i = 2; i <= 10; i++) {
            str = str.concat(separator);
            str = str.concat(String.valueOf(i));
        }
        return str;
    }
}
