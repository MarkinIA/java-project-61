package hexlet.code.games;

public class Parity implements Game {
    private final int startOfRange = 0;
    private final int endOfRange = 100;
    private int currNum;
    private String correctAnswer;

    public String getQuestion() {
        currNum = startOfRange + (int) (Math.random() * endOfRange);
        return Integer.toString(currNum);
    }

    public String getCorrectAnswer() {
        correctAnswer = currNum % 2 == 0 ? "yes" : "no";
        return correctAnswer;
    }
}
