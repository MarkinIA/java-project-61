package hexlet.code.games;

import java.util.Random;

public class Calculator implements Game {
    private final int startOfRange = 0;
    private final int endOfRange = 100;
    private final String[] operators = {"+", "-", "*"};
    private String correctAnswer;
    private int number1;
    private int number2;
    String operator;

    public String getQuestion() {
        Random random = new Random();
        number1 = startOfRange + (int) (Math.random() * endOfRange);
        number2 = startOfRange + (int) (Math.random() * endOfRange);
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
            default:
                break;
        }
        return Integer.toString(result);
    }
}
