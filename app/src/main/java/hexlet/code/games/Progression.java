package hexlet.code.games;

import java.util.Random;

public final class Progression implements Game {

    private static final int RANGE_OF_NUMBERS = 100;
    private static final int RANGE_OF_ARRAY = 10;

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        Random random = new Random();
        StringBuilder string = new StringBuilder();
        String[] numbers = new String[RANGE_OF_ARRAY];
        int number = random.nextInt(RANGE_OF_NUMBERS);
        int step = random.nextInt(RANGE_OF_NUMBERS);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.toString(number);
            number = number + step;
        }
        int concealIndex = random.nextInt(RANGE_OF_ARRAY);
        String concealedNum = numbers[concealIndex];
        numbers[concealIndex] = "..";
        for (int j = 0; j < numbers.length; j++) {
            string.append(numbers[j]);
            if (j < numbers.length - 1) {
                string.append(" ");
            }
        }
        String questionString = string.toString();
        data[0] = questionString;
        data[1] = concealedNum;
        return data;
    }
}
