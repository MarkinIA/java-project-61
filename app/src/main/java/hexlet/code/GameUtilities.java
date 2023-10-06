package hexlet.code;

public class GameUtilities {
    private static final int START_OF_RANGE = 0;
    private static final int END_OF_RANGE = 100;
    public static int getRandom() {
        return START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
    }
}
