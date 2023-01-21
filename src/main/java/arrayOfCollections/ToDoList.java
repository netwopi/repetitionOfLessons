package arrayOfCollections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ToDoList {
    public static void main(String[] args) {
        try {
            int dealNumber;
            String editName;
            int choice;
            String addСase;
            int whereToAddCase;
            int addToPosition;
            int deleteByIndex;
            int jobDoneNote;
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Фильм");
            arrayList.add("Спорт");
            arrayList.add("Бегать");
            arrayList.add("Спать");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("1 - LIST\n2 - ADD\n3 - EDIT\n4 - DELETE\n5 - NOTE");
                choice = scanner.nextInt();
                if (choice == 1) {
                    reedArraylist(arrayList);
                } else if (choice == 2) {
                    System.out.println("Добавить дело");
                    addСase = scanner.nextLine();
                    System.out.println("1 - в начало списка\n2 - конец списка\n3 - в любое место");
                    whereToAddCase = scanner.nextInt();
                    if (whereToAddCase == 1) {
                        arrayList.add(0, addСase);
                        System.out.println("Добавлено");
                    } else if (whereToAddCase == 2) {
                        arrayList.add(addСase);
                        System.out.println("Добавлено");
                    } else if (whereToAddCase == 3) {
                        System.out.println("На какую позицию добавить дело");
                        addToPosition = scanner.nextInt();
                        insert(arrayList, addСase, addToPosition);
                        System.out.println("Добавлено");
                    } else {
                        System.out.println("Что-то пошло не так");
                    }
                } else if (choice == 3) {
                    System.out.println("Введите порядковый номер дела, которое вы хотите изменить");
                    dealNumber = scanner.nextInt();
                    arrayList.remove(dealNumber);
                    System.out.println("Введите, новое задание вместо старого");
                    editName = scanner.nextLine();
                    arrayList.add(dealNumber, editName);
                } else if (choice == 4) {
                    System.out.println("Удаляем элимент по индексу");
                    deleteByIndex = scanner.nextInt();
                    arrayList.remove(deleteByIndex);
                } else if (choice == 5) {
                    System.out.println("Помечаем как сделаное по индексу");
                    jobDoneNote = scanner.nextInt();
                    String arraySt = arrayList.get(jobDoneNote);
                    if (arraySt.endsWith("СДЕЛАНО")) {
                        arrayList.set(jobDoneNote, arraySt);
                    } else {
                        arrayList.set(jobDoneNote, arraySt + " СДЕЛАНО");
                    }
                } else {
                    break;
                }
            }
        }catch (Exception e){
            System.err.println("Exception : 404");
        }
    }
    public static void reedArraylist(ArrayList<String> arrayList){
        AtomicInteger x = new AtomicInteger();
        arrayList.forEach(s -> System.out.println(x.getAndIncrement() + " " + s));

    }
    private static ArrayList<String> insert(ArrayList<String> a, String key, int index) {
        a.add(index,key);
        return a;
    }
}
