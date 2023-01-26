package arrayOfCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "1");
        try {
            while (true) {
                System.out.println("\nЭто телефонная книга\n1 - Введение номера телефона и имени\n2 - Показать весь список контактов");
                String str = scanner.nextLine();
                if (str.equals("1")) {
                    System.out.println("Введите номер телефона");
                    String phone = scanner.nextLine();
                    phone = phone.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
                    Integer x = Integer.valueOf(phone);
                    System.out.println("Введите Имя абонента");
                    String name = scanner.nextLine();
                    boolean isKeyExists = hashMap.get(x) != null;
                    if (phone.length() != 0 || name.length() != 0) {
                        if (isKeyExists) {
                            for (HashMap.Entry<Integer, String> entry : hashMap.entrySet())
                                if (entry.getKey().equals(x)) {
                                    System.out.println("имя " + entry.getValue() + " номер телефона - " + entry.getKey());
                                }
                        } else {
                            hashMap.put(x, name);
                            System.out.println("Добавлено");
                        }
                    } else {
                        System.out.println("Не корректный ввод");
                    }
                } else if (str.equals("2")) {
                    for (HashMap.Entry<Integer, String> entry : hashMap.entrySet())
                        System.out.println("имя " + entry.getValue() + " номер телефона - " + entry.getKey());
                } else {
                    break;
                }
            }
        }catch (Exception e){
            System.err.println("Не корректные данные");
        }
    }
}

