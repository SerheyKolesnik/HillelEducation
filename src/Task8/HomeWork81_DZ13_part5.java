/*
5*) Написать метод: входящий параметр - строка.
Метод должен вернуть ту же строку где все маленькие буквы заменены на большие
а остальные символы остались без изменений,
не используя методы toUpperCase/toLowerCase
 */
package Task8;

public class HomeWork81_DZ13_part5 {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println(upStr(s));
    }

    public static String upStr(String s) {
        int n;
        char s2;
        String s3;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) > 96) {
                n = (int) s.charAt(i) - 32;
                s2 = (char) n;
            } else {
                s3 = s.substring(i, i+1);
                s2 = (char) (int) s3.charAt(0);
            }
            result += s2;
        }
        return result;
    }
}






