package hexlet.code.games;

public class GCD implements GameEngine {
    private final int startOfRange = 0;
    private final int endOfRange = 100;
    private int firstNumber;
    private int secondNumber;

    @Override
    public String getQuestion() {
        firstNumber = startOfRange + (int) (Math.random() * endOfRange);
        secondNumber = startOfRange + (int) (Math.random() * endOfRange);
        return firstNumber + " " + secondNumber;
    }

    @Override
    public String getCorrectAnswer() {
        int decRemains;
        while (secondNumber != 0) {
            decRemains = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = decRemains;
        }
        return Integer.toString(firstNumber);
    }
}
