package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression implements Game {
    private String[] numbers = new String[10];

    private String concealedNum;

    private String correctAnswer;

    public void getRules() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public void getQuestion() {
        Random random = new Random();
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
    }

    @Override
    public void getCorrectAnswer() {
        correctAnswer = concealedNum;
    }

    public String[] getData() {
        String[] data = new String[2];
        getQuestion();
        data[0] = Arrays.toString(numbers);
        getCorrectAnswer();
        data[1] = correctAnswer;
        return data;
    }
}
