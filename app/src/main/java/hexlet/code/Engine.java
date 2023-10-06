package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALCULATOR = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static void gameStart(int choice) {
        switch (choice) {
            case (GREET):
                Cli.introduction();
                break;
            case (EVEN):
                Even parity = new Even();
                gamePlay(parity);
                break;
            case (CALCULATOR):
                Calculator calculator = new Calculator();
                gamePlay(calculator);
                break;
            case (GCD):
                GCD gcd = new GCD();
                gamePlay(gcd);
                break;
            case (PROGRESSION):
                Progression progression = new Progression();
                gamePlay(progression);
                break;
            case (PRIME):
                Prime prime = new Prime();
                gamePlay(prime);
                break;
            default:
                break;
        }
    }

    public static void gamePlay(Game gameEngine) {
        Scanner input = new Scanner(System.in);
        int count;
        String answer;
        String correctAnswer;
        String name;
        String[] data;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        gameEngine.getRules();
        for (count = 0; count < 3; count++) {
            data = gameEngine.getData();
            System.out.println("Question: " + data[0]);
            System.out.print("Your answer: ");
            answer = input.nextLine();
            correctAnswer = data[1];
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'\nLet's try again, " + name + "!");
                break;
            }

        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
