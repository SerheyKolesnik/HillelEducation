/*
6*) Написать метод который проверяет состоит ли строка из одних только цифр.
Метод должен вернуть true или false
 */
package Task8;

public class HomeWork81_DZ13_part6 {
    public static void main(String[] args) {
        String s = "125k";
        System.out.println("В строке только буквы: "+digitStr(s));
    }

    public static boolean digitStr(String s) {
        boolean digstr = true;
        int sl = s.length();
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) < 48 || (int) s.charAt(i) > 57) {
                digstr = false;
                break;
            }
        }
        return digstr;
    }
}
