package numbersStringsIDates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitText {
    public static void main(String[] args) {
        String text = "Today’s podcast is about breakfast. Probably most people think of breakfast as the meal you eat " +
                "at the beginning of the day, when you first wake up. However, it is more complicated than that. First, " +
                "let’s look at what the word “breakfast” really means. As you probably know, the word “fast” has " +
                "several, completely different meanings in English. One of the meanings of “fast” is a period when you" +
                " do not have any food to eat. So, for example, Muslims fast during the month of Ramadan – they do not" +
                " eat anything between sunrise and sunset. A “breakfast” is, literally, a meal which you eat at the end" +
                " of a period of fasting. When you eat breakfast, you break – or end – your fast. When I get up in the " +
                "morning, I have not had anything to eat since about 7 o’clock the night before. Now that is not a very" +
                " long fast – perhaps 12 hours, but not more. However, the meal which we eat first thing in the morning " +
                "breaks our overnight fast, so we call it “breakfast”. What do you eat for breakfast? I have a bowl of " +
                "muesli with milk, two pieces of toast with marmalade, and two cups of coffee. Some people go for a run " +
                "first thing in the morning, and then have a breakfast of fruit and orange juice. They are slim and fit " +
                "and healthy and they make me feel guilty so I do not like them. Other people have no breakfast at all –" +
                " they do not eat until the middle of the day. Nutritionists tell us that it is not a good idea to go" +
                " without breakfast, because your concentration is poor if you have not had anything to eat. Other people" +
                " eat huge breakfasts, with fried eggs and bacon, sausages, mushrooms and fried bread. In hotels and " +
                "restaurants, a big cooked breakfast is called an “English breakfast”. Actually, very few English people " +
                "eat a cooked breakfast every day. We do not have time. We are in a hurry to catch the bus or the train" +
                " and get to work.I am very interested in breakfast today, because I have not had any! The doctor has the" +
                " silly idea that I may have too much cholesterol in my blood. So, later today, I have to go to have a " +
                "blood test. The nurse will stick an enormous needle into my arm, and take out several litres of blood," +
                " and send the blood away to a laboratory to be tested. The laboratory will of course send back a report" +
                " to say that my blood cholesterol is absolutely wonderful, and that they have never seen such magnificent" +
                " blood before. But – and this is the terrible bit – the blood test is what the doctor calls a “fasting " +
                "blood test”. That means that I must not eat anything for at least 12 hours before the test. So, no " +
                "breakfast.Now, it would be sensible to have a fasting blood test early in the morning, so that I do " +
                "not have to wait a long time to have something to eat. However, the nurse who takes the blood tests " +
                "only works in the afternoon, so I cannot eat anything until about 3 o’clock. You have no idea how " +
                "terrible this is. It is the middle of the morning, and I am hungry, really hungry. I cannot stop " +
                "thinking about breakfast. Surely a very little bowl of muesli and one slice of toast with no marmalade " +
                "would be OK. Surely a very small breakfast would not ruin the blood test. However, the nurse who does " +
                "the blood tests is big and fierce, and so I stay hungry. And now the telephone rings. It is the " +
                "receptionist at the doctor’s surgery. She is very sorry, but the fierce nurse who does the blood " +
                "tests is unwell and cannot come to work today. Please can she re-arrange the blood test for another " +
                "day. How do I feel? What is my reaction to this news? First, of course, I am relieved. I can eat my" +
                " breakfast! I do not have to fast until the middle of the afternoon. But I am also annoyed. Why?" +
                " Because I will have to go without my breakfast on another day in a few weeks time. Finally, I have an " +
                "English expression for you to learn. I have talked about people who without” their breakfast, or " +
                "“do without” their breakfast. If you “do without something, or “go without” something, you decide " +
                "that you do not need it – perhaps because you do not have time, or you do not have enough money. " +
                "Here are some more things you might “do without”. If you do not have enough money, you might have " +
                "to do without new clothes or shoes. If you are very busy at work, you might go without your normal " +
                "lunch break. If you feel tired and unwell, you might decide to do without your normal trip to the " +
                "cinema, and go to bed early instead.And if the blood test tells me that I have too much cholesterol" +
                " in my blood, I might have to do without butter, and cheese, and chocolate, or all sorts of other nice " +
                "things to eat. I might even have to go for a run first thing in the morning, and eat fruit and drink " +
                "orange juice for breakfast. It is too awful to think about!";

        System.out.println(text.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", ""));
        text = text.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
        String[] words = text.split(" ");
        List<String> list = new ArrayList<>(Arrays.stream(words).toList());
        list.stream().forEach(System.out::println);



    }

}
