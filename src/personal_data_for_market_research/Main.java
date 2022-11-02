package personal_data_for_market_research;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("personal data for market research.txt");

            if (file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("личные данные для ислледования рынка");
            pw.println("+ 7 101 234-23-24 ann@domain.org");
            pw.println("ann1@domain.org");
            pw.println("+ 7 911 442-13-52 abc@mail.ru");
            pw.println("cba@yandex.ru");
            pw.println("+ 7 983 331-51-31 aaa@mail.ru");
            pw.println("bbb@mail.ru");
            pw.println("+ 7 983 331-51-31 another@email.ru");
            pw.println("+ 7 213 123-51-21 mY@email.com");
            pw.close();

            br = new BufferedReader(new FileReader("personal data for market research.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("line");
            }
        } catch (IOException e) {
            System.out.print("Error: +e");
        } finally {
            try {
                br.close();
            } catch (IOException e) {

            }
        }
    }
}