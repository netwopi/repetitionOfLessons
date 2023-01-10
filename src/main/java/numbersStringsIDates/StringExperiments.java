package numbersStringsIDates;

public class StringExperiments {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";


        int indexVasia = text.indexOf("рублей");
        String endString = text.substring(indexVasia);
        String  stringVasiya = text.substring(0,indexVasia);
        int indexPetya = endString.indexOf("рубля");
        String stringPetiya = endString.substring(0, indexPetya);
        int indexMasha = endString.lastIndexOf("Маша - ");
        String stringMasha = endString.substring(indexMasha);
        int vasiya = fromStringToNumber(stringVasiya);
        int petiya = fromStringToNumber(stringPetiya);
        int masha = fromStringToNumber(stringMasha);
        System.out.print("Сумма всех зарплат : ");
        System.out.println(vasiya+petiya+masha);
    }
    public static int fromStringToNumber(String str){
        String v;
        v = str.replaceAll("\\D+","");
        int in = Integer.parseInt(v);
        return in;
    }
}
