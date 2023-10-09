package hexlet.code.games;

import hexlet.code.GameUtilities;

public final class Even implements Game {
    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public boolean isEven(int currNum) {
        return currNum % 2 == 0;
    }

    @Override
    public String[] getData() {
        String[] data = new String[2];
        int currNum = GameUtilities.getRandom();
        data[0] = Integer.toString(currNum);
        data[1] = isEven(currNum) ? "yes" : "no";
        return data;
    }
}
