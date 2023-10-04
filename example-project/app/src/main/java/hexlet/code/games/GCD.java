package hexlet.code.games;

public class GCD implements GameEngine{
    private final int START_OF_RANGE = 0;
    private final int END_OF_RANGE = 100;
    private int firstNumber;
    private int secondNumber;

    @Override
    public String getQuestion() {
        firstNumber = START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
        secondNumber = START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
        return firstNumber + " " + secondNumber;
    }

    @Override
    public String getCorrectAnswer() {
        int decRemains;
        while(secondNumber != 0) {
            decRemains = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = decRemains;
        }
        return Integer.toString(firstNumber);
    }
}
