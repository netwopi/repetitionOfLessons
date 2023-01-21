package arrayOfCollections;

import java.util.HashSet;
import java.util.Scanner;

public class EmailCheck {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello@skillbox.ru");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Сделайте выбар цыфрой \n1 - распечать \n2 - добавить\n0 - выход");
            int in = scanner.nextInt();
            if (in == 1) {
                hashSet.forEach(System.out::println);
            } else if (in == 2) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Введите адрес электроной почты");
                String YourEmail = scanner2.nextLine();
                boolean valid = emailValidator.validate(YourEmail);
                if (!valid) {
                    System.out.println("Не корректный ввод Email\nПример: 'hello@skillbox.ru'");
                } else {
                    if (hashSet.stream().anyMatch(i -> i.equals(YourEmail))) {
                        System.out.println("Уже существует , попробуйте другой");
                        hashSet.add(YourEmail);
                    } else {
                        hashSet.add(YourEmail);
                        System.out.println("Успешно добавлено");
                    }
                }
            }else {
                break;
            }
        }
    }
}
