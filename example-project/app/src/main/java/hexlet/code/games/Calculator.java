package hexlet.code.games;

import java.util.Random;

public class Calculator implements GameEngine {
    private final int START_OF_RANGE = 0;
    private final int END_OF_RANGE = 100;
    private final String[] operators = {"+", "-", "*"};
    private String correctAnswer;
    private int number1;
    private int number2;
    String operator;

    public String getQuestion() {
        Random random = new Random();
        number1 = START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
        number2 = START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
        operator = operators[random.nextInt(3)];

        return number1 + operator + number2;
    }

    public String getCorrectAnswer() {
        int result = 0;
        switch (operator) {
            case ("+"):
                result = number1 + number2;
                break;
            case ("-"):
                result = number1 - number2;
                break;
            case ("*"):
                result = number1 * number2;
                break;
        }
        return Integer.toString(result);
    }
}
