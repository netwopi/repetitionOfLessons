package arrayOfCollections;

import java.io.*;
import java.util.Scanner;

public class CarNumber {
    public void NumberGenerator() {
        String[] bukvy = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
        System.out.print("Введите регион (1..199): ");
        Scanner in = new Scanner(System.in);
        File file = new File("Output.txt");
        int region = in.nextInt();
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            if(region>=1 && region<=199) {
                Generator(bukvy , region , fileWriter);
            }else {
                System.out.println("Превышен лимит или не вкрный воод , выбран максимвльный регион");
                region = 199;
                Generator(bukvy , region , fileWriter);
            }
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("ОШИБКА");;
        }
    }
    private static void Generator(String[] bukvy ,int region , FileWriter fileWriter) throws IOException {
        for (int i = 0; i < bukvy.length; i++) {
            //первые 2 нуля
            for (int j = 1; j <= 10; j++) {
                String s = String.format("%s%03d%s%02d\n", bukvy[i], j, bukvy[i] + bukvy[i], region);
                fileWriter.write(s);
            }

            //буквы и цифры
            for (int j = 111; j <= 999; j += 111) {
                String y = String.format("%s%03d%s%02d\n", bukvy[i], j, bukvy[i] + bukvy[i], region);
                fileWriter.write(y);
            }
        }

        //одинаковые цифры
        for (int i = 111; i <= 999; i += 111) {
            for (int j = 0; j < bukvy.length; j++) {
                for (int j2 = 0; j2 < bukvy.length; j2++) {
                    for (int k = 0; k < bukvy.length; k++) {
                        String x = String.format("%s%03d%s%02d\n", bukvy[j], i, bukvy[j2] + bukvy[k], region);
                        fileWriter.write(x);
                    }
                }
            }
        }
    }
}

