package hexlet.code.games;

import hexlet.code.GameUtilities;

import java.util.Random;

public final class Calculator implements Game {
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int RANGE = 3;


    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }

    public String calcExpression(int number1, int number2, String operator) {
        int result;
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
                throw new RuntimeException("Incorrect operation presented");
        }
        return Integer.toString(result);
    }

    @Override
    public String[] getData() {
        Random random = new Random();
        int number1 = GameUtilities.getRandom();
        int number2 = GameUtilities.getRandom();
        String operator = OPERATORS[random.nextInt(RANGE)];
        String[] data = new String[2];
        data[0] = number1 + " " + operator + " " + number2;
        data[1] = calcExpression(number1, number2, operator);
        return data;
    }
}
