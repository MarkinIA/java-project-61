package hexlet.code.games;

import hexlet.code.GameUtilities;

public class GCD implements Game {
    private int firstNumber;
    private int secondNumber;

    private String correctAnswer;

    @Override
    public void getRules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
    @Override
    public void getQuestion() {
        firstNumber = GameUtilities.getRandom();
        secondNumber = GameUtilities.getRandom();
    }

    @Override
    public void getCorrectAnswer() {
        int decRemains;
        while (secondNumber != 0) {
            decRemains = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = decRemains;
        }
        correctAnswer = Integer.toString(firstNumber);
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        getQuestion();
        data[0] = firstNumber + " " + secondNumber;
        getCorrectAnswer();
        data[1] = correctAnswer;
        return data;
    }
}
