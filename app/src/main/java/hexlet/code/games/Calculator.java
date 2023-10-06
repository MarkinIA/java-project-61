package hexlet.code.games;

import hexlet.code.GameUtilities;

import java.util.Random;

public final class Calculator implements Game {
    private final String[] operators = {"+", "-", "*"};
    private static final int RANGE = 3;
    private String correctAnswer;
    private int number1;
    private int number2;
    private String operator;


    @Override
    public void getRules() {
        System.out.println("What is the result of the expression?");
    }
    @Override
    public void getQuestion() {
        Random random = new Random();
        number1 = GameUtilities.getRandom();
        number2 = GameUtilities.getRandom();
        operator = operators[random.nextInt(RANGE)];
    }

    @Override
    public void getCorrectAnswer() {
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
                throw new IllegalArgumentException("Incorrect operation presented");
        }
        correctAnswer = Integer.toString(result);
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        getQuestion();
        data[0] = number1 + " " + operator + " " + number2;
        getCorrectAnswer();
        data[1] = correctAnswer;
        return data;
    }
}
