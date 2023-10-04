package hexlet.code.games;
public class Parity implements GameEngine {
    private final int START_OF_RANGE = 0;
    private final int END_OF_RANGE = 100;
    private int currNum;
    private String correctAnswer;

    public String getQuestion() {
        currNum = START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
        return Integer.toString(currNum);
    }

    public String getCorrectAnswer() {
        correctAnswer = currNum % 2 == 0 ? "yes" : "no";
        return correctAnswer;
    }
}