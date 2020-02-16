/*
4) Население земли 7500000000 человек
Если предположить что каждый год оно будет увеличиваться на 10% вывести количество людей через 3 года.
 */
package Task6;

public class HomeWork61_DZ11_part4 {
    public static void main(String[] args) {
        long currentEarthPopulation = 7500000000L;
        int growtYear = 10;
        float growthRate = (float) (Math.round(Math.pow((100 + growtYear) / 100.0, 3) * 1000) / 1000.0);
        long futurePop = (long) (currentEarthPopulation * growthRate);
        System.out.printf("Население Земли через 3 года составит: %s", futurePop);
    }
}
