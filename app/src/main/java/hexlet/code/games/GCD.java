package hexlet.code.games;

import hexlet.code.GameUtilities;

public final class GCD implements Game {
    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getGCD(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int decRemains = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = decRemains;
        }
        return Integer.toString(firstNumber);
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        int firstNumber = GameUtilities.getRandom();
        int secondNumber = GameUtilities.getRandom();
        data[0] = firstNumber + " " + secondNumber;
        data[1] = getGCD(firstNumber, secondNumber);
        return data;
    }
}
