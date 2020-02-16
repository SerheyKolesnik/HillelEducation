package Task11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        File baseFile = new File("C:\\Users\\Sergey\\IdeaProjects\\Hillel_tasks\\src\\Task11\\listResults.txt");

        String[] lines = new String[0];
        String[] buf;
        String s = "";
        int count = 0;

//read file
        try {
            FileReader fr = new FileReader(baseFile);
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null) {
//skopiruem tekuschi massiv
                buf = lines;
//sozdadim novy na 1 stroku bolshe
                lines = new String[count + 1];
//perenesem bufer v novy massiv i dobavim v nego prochitannuu stroku
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

    }
}
