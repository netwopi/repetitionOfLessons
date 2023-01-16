package arrayOfCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PatientTemperature {
    public static void main(String[] args) {
        Random random = new Random();
        int s = random.nextInt(100,160);
        ArrayList<Float> list = new ArrayList<Float>();
        int in = 0;
        for(int d = 0 ; d<s ; d++) {
            float x = random.nextFloat(32, 40);
            list.add(getLttleFloat(x));
            if(list.get(d) == 36.6F){
                in++;
            }
        }
        System.out.print("Температуры пациентов: ");
        list.stream().forEach(x-> System.out.print(x+" "));
        System.out.println("\nСредняя температура: " + getAverage(list));
        System.out.println("Количество здоровых: "+in);
    }
    private static double getAverage(List<Float> list) {
        return list.stream()
                .mapToDouble(a -> a)
                .average().orElse(0);
    }
    private static float getLttleFloat(float f){
        String firstStr = String.format("%.1f", f);
        firstStr = firstStr.replaceFirst(",",".");
        return Float.parseFloat(firstStr);
    }
}
