/*
4*) Вычислить чиcло PI с точность несколько знаков после запятой:
a) ряд Лейбница:
PI = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15) ...

b) ряд Нилаканта:
PI = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - 4/(8*9*10) + 4/(10*11*12) - (4/(12*13*14) ...

Определить какой из рядов дает необходимую точность при меньшем количестве итераций.
 */

package Task7;

public class HomeWork71_DZ12_part41 {
    public static final double PIBASE = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;

    public static void main(String[] args) {
        int n = 100000;
        double piNilacanta = methodNilacanta(n);
        System.out.println("Нилаканта: " + piNilacanta);
        System.out.println("Отклонение Нилаканта: " + piNilacanta / PIBASE * 100 + "%");
        double piLeibniz = methodLeibniz(n);
        System.out.println("Лейбница: " + piLeibniz);
        System.out.println("ОтклонениеЛейбница: " + piLeibniz / PIBASE * 100 + "%");
        System.out.println("Наибольшую точность дает метод: "
                + ((piNilacanta / PIBASE * 100 )<(piLeibniz / PIBASE * 100)?"Нилаканта":"Лейбница"));
        //((num1 < num2) ? num1 : num2)
    }

    private static double methodNilacanta(int n) {
        double pi = 3;
        int a = 2, b = 3, c = 4;
        for (int i = 0; i < n; i++) {
            pi += 4.0 / (a * b * c);
            a += 2;
            b += 2;
            c += 2;
            pi -= 4.0 / (a * b * c);
            a += 2;
            b += 2;
            c += 2;
        }
        return pi;
    }

    //PI = (4/1) - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + (4/13) - (4/15)
    private static double methodLeibniz(int n) {
        double pi = 0;
        int factor = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                pi += factor * 4.0 / i;
                factor *= -1;
            }
        }
        return pi;
    }

}
