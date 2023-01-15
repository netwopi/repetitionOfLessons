package numbersStringsIDates;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class AllMyBirthdays {
    public static void main(String[] args) {
        int day = 9;
        int month = 1;
        int year = 1996;
        int d=0;
        String str = day +"/"+month +"/";
        LocalDate now = LocalDate.now();
        int theCurrentDate = now.getYear();
            for (int s = year; theCurrentDate >= s; s++) {
                if(theCurrentDate == s) {
                    System.out.println("В этом году вам");
                }
                String x = LocalDate.parse(str + s, DateTimeFormatter.ofPattern("d/M/uuuu"))
                        .getDayOfWeek()
                        .getDisplayName(TextStyle.SHORT_STANDALONE, Locale.US);
                System.out.println(d + " - " + day + "." + month + "." + s + "-" + x);
                d++;

            }
    }
}
