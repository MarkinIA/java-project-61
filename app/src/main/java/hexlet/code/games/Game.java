package hexlet.code.games;

public interface Game {
    void getQuestion();
    void getCorrectAnswer();

    void getRules();

    String[] getData();
}
