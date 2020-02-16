/*
3*) В текстовый файл построчно записаны фамилия и имя учащихся класса и его оценка.
a) Вывести средний балл по классу.
b) Записать в другой файл всех чья оценка меньше 3 баллов.
Примерное содержание файла:

Иванов О. 4
Петров И. 3
Дмитриев Н. 2
Смирнова О. 4
Керченских В. 5
Котов Д. 2
Бирюкова Н. 1
Данилов П. 3
Аранских В. 5
Лемонов Ю. 2
Олегова К. 4
 */
package Task11;

import java.io.*;

public class HW11_03 {
    private static final String FILEPATHNAME = "C:\\Users\\Sergey\\IdeaProjects\\Hillel_tasks\\src\\Task11\\less3.txt";
    private static final String FILELISTRESULT = "C:\\Users\\Sergey\\IdeaProjects\\Hillel_tasks\\src\\Task11\\listResults.txt";

    public static void main(String[] args) {
        File baseFile = new File(FILELISTRESULT);

        String[] lines = new String[0];
        String[] buf;
        String s = "";
        int count = 0;

        try {
            FileReader fr = new FileReader(baseFile);
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null) {
                buf = lines;
                lines = new String[count + 1];
                for (int i = 0; i < buf.length; i++) {
                    lines[i] = buf[i];
                }
                lines[count] = s;
                count++;
            }

            for (int i = 0; i < lines.length; i++) {
                System.out.println(lines[i]);
            }
            br.close();

        } catch (IOException e) {
        }
        System.out.println("Среднее арифметическое результатов: " + averageMark(lines));
        try {
            less3(lines);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double averageMark(String[] arr) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i].substring(arr[i].length() - 1));
            count++;
        }
        return (double) sum / count;
    }

    public static void less3(String[] arr) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i].substring(arr[i].length() - 1)) < 4) {

                try {
                    FileWriter writer = new FileWriter(FILEPATHNAME, true);
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.write(arr[i] + "\n");
                    bufferWriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
