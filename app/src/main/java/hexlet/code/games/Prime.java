package hexlet.code.games;

import java.util.Random;

public final class Prime implements Game {
    private static final int RANGE_OF_NUMBERS = 1000;

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime, Otherwise answer 'no'.";
    }

    public boolean isPrime(int currNum) {
        int decimal = 2;
        while (currNum % decimal != 0) {
            decimal++;
        }
        return decimal == currNum;
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        Random random = new Random();
        int currNum = random.nextInt(RANGE_OF_NUMBERS);
        data[0] = Integer.toString(currNum);
        data[1] = isPrime(currNum) ? "yes" : "no";
        return data;
    }
}
