package arrayOfCollections;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class LeadTime {
    public static void main(String[] args) {
        CarNumber carNumber = new CarNumber();
        carNumber.NumberGenerator();
        Scanner scanner = new Scanner(System.in);
        String content = null;
        String regex = "\\s+";
        ArrayList<String> arrayList = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        try {
            content = readFile("Output.txt", StandardCharsets.UTF_8, regex);
            arrayList = new ArrayList<>(Arrays.asList(content.split(" ")));
            hashSet = new HashSet<>(arrayList);
            treeSet = new TreeSet<>(arrayList);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Поиск номера введите номер");
        String stateNumber = scanner.nextLine().toUpperCase();

        long a = System.nanoTime();
        if (arrayList.contains(stateNumber)) {
            System.out.println("Поиск перебором: номер найден, поиск занял: " + (System.nanoTime() - a) + "нс");
        } else {
            System.out.println("Поиск перебором: номер не найден, поиск занял: " + (System.nanoTime() - a) + "нс");
        }
        long b = System.nanoTime();
        Collections.sort(arrayList);
        if (Collections.binarySearch(arrayList, stateNumber) >= 0) {
            System.out.println("Бинарный поиск: номер найден, поиск занял: " + (System.nanoTime() - b) + "нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял: " + (System.nanoTime() - b) + "нс");
        }
        long c = System.nanoTime();
        if (hashSet.contains(stateNumber)) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял: " + (System.nanoTime() - c) + "нс");
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял: " + (System.nanoTime() - c) + "нс");
        }
        long d = System.nanoTime();
        if (treeSet.contains(stateNumber)) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял: " + (System.nanoTime() - d) + "нс");
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял: " + (System.nanoTime() - d) + "нс");
        }
    }
        public static String readFile (String path, Charset encoding, String regex) throws IOException {
            String content = Files.lines(Paths.get(path), encoding)
                    .collect(Collectors.joining(System.lineSeparator())).replaceAll(regex, " ");
            return content;
        }
    }

