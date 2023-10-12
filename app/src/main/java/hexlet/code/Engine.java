package hexlet.code;

import hexlet.code.games.Game;


import java.util.Scanner;

public class Engine {
    public static final int AMOUNT_OF_ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;
    public static void playGame(Game game) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(game.getRules());
        for (int count = 0; count < AMOUNT_OF_ROUNDS; count++) {
            String[] data = game.getData();
            System.out.println("Question: " + data[QUESTION]);
            System.out.print("Your answer: ");
            String answer = input.nextLine();
            String correctAnswer = data[ANSWER];
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'\nLet's try again, " + name + "!");
                break;
            }
            if (count == 2) {
                System.out.println("Congratulations, " + name + "!");
            }

        }
    }
}
