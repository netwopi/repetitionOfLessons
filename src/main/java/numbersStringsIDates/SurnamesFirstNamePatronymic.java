package numbersStringsIDates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SurnamesFirstNamePatronymic {
    public static void main(String[] args) {
        Model model = new Model();
        Scanner scanner = new Scanner(System.in);
        System.out.println("В ведите ФИО");
        String x = scanner.nextLine();
        x = x.trim();
        x = x.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
        String[] words = x.split(" ");
        List<String> list = new ArrayList<>(Arrays.stream(words).toList());
        if (list.size()==3) {
            model.setSurname(list.get(0));
            model.setFirstName(list.get(1));
            model.setPatronymic(list.get(2));
            System.out.println("Фамилия: " + model.getSurname());
            System.out.println("Имя: " + model.getFirstName());
            System.out.println("Отчество: " + model.getPatronymic());
        } else {
            System.out.println("Ошибка");
        }
    }
}
