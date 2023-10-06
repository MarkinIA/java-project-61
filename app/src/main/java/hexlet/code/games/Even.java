package hexlet.code.games;

import hexlet.code.GameUtilities;

public class Even implements Game {
    private int currNum;
    private boolean correctAnswer;

    public void getRules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public void getQuestion() {
        currNum = GameUtilities.getRandom();
    }

    public boolean getEven() {
        return currNum % 2 == 0;
    }

    public void getCorrectAnswer() {
        correctAnswer = getEven();
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
