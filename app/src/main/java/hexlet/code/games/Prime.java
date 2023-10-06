package hexlet.code.games;

import java.util.Random;

public class Prime implements Game {
    private int currNum;
    private boolean correctAnswer;

    public void getRules() {
        System.out.println("Answer 'yes' if given number is prime, Otherwise answer 'no'.");
    }

    @Override
    public void getQuestion() {
        Random random = new Random();
        currNum = random.nextInt(1000);
    }

    public boolean getPrime() {
        int decimal = 2;
        while (currNum % decimal != 0) {
            decimal++;
        }
        return decimal == currNum;
    }

    @Override
    public void getCorrectAnswer() {
        correctAnswer = getPrime();
    }

    public String[] getData() {
        String[] data = new String[2];
        getQuestion();
        data[0] = Integer.toString(currNum);
        getCorrectAnswer();
        data[1] = correctAnswer ? "yes" : "no";
        return data;
    }
}
