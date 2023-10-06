package hexlet.code.games;

import java.util.Random;

public class Prime implements GameEngine {
    private int currNum;
    @Override
    public String getQuestion() {
        Random random = new Random();
        currNum = random.nextInt(1000);
        return Integer.toString(currNum);
    }

    @Override
    public String getCorrectAnswer() {
        int decimal = 2;
        while (currNum % decimal != 0) {
            decimal++;
        }
        if (decimal == currNum) {
            return "yes";
        }
        return "no";
    }
}
