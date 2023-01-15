package numbersStringsIDates;

import java.util.Scanner;

public class PhoneNumberEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В ведите номер телефона");
        String str = scanner.nextLine();
        myNamePhone(str);
    }
    public static void myNamePhone(String str){
        str = str.trim();
        str = str.replaceAll("[^A-Za-zА-Яа-я0-9]","");
        String firstNum = String.valueOf(str.charAt(0));
        if(str.length()==11) {
            if (firstNum.equals("7")) {
                System.out.println(str);
            } else if (firstNum.equals("8")) {
                String s = str.replaceFirst("8", "7");
                System.out.println(s);
            } else if (firstNum.equals("7") || firstNum.equals("8")) {
                System.out.println(str);
            } else {
                System.out.println("Неверный формат номера");
            }
        } else if (str.length()==10) {
            String d = "7";
                    String x = d.concat(str);
            System.out.println(x);
        }else {
            System.out.println("Неверный формат номера");
        }
    }
}
