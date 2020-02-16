/*
4) Проверить является ли строка палиндром,
т.е. читается в обоих направления одинаково,
например: `121`, `test_tset`, `12345678987654321`, `_asdf.fdsa_`.
 */
package Task8;

public class HomeWork81_DZ13_part4 {
    public static void main(String[] args) {
    String str ="rotor";
        System.out.println(str+" Палиндром: "+isPalindrome(str));
     }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}

