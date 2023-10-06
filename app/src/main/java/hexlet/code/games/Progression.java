package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression implements Game {
    private String[] numbers = new String[10];

    private String concealedNum;

    @Override
    public String getQuestion() {
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
        return Arrays.toString(numbers);
    }

    @Override
    public String getCorrectAnswer() {
        return concealedNum;
    }
}
