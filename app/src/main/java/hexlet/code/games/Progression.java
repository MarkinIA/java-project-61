package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression implements Game {
    private String[] numbers = new String[10];

    private String concealedNum;

    private String correctAnswer;

    private String questionString;

    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public void getQuestion() {
        Random random = new Random();
        StringBuilder string = new StringBuilder();
        int number = random.nextInt(100);
        int step = random.nextInt(100);
        int concealIndex;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.toString(number);
            number = number + step;
        }
        concealIndex = random.nextInt(10);
        concealedNum = numbers[concealIndex];
        numbers[concealIndex] = "..";
        for (int j = 0; j < numbers.length; j++) {
            string.append(numbers[j]);
            if (j < numbers.length - 1) {
                string.append(" ");
            }
        }
        questionString = string.toString();
    }

    @Override
    public void getCorrectAnswer() {
        correctAnswer = concealedNum;
    }

    public String[] getData() {
        String[] data = new String[2];
        getQuestion();
        data[0] = questionString;
        getCorrectAnswer();
        data[1] = correctAnswer;
        return data;
    }
}
