package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.GameEngine;
import hexlet.code.games.Parity;
import java.util.Scanner;

public class Engine {
    public static void gameStart() {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String name;
        int choice;
        stringBuilder.append("Please enter the game number and press Enter.\n");
        stringBuilder.append("1 - Greet\n");
        stringBuilder.append("2 - Even\n");
        stringBuilder.append("3 - Calculator\n");
        stringBuilder.append("4 - GCD\n");
        stringBuilder.append("0 - Exit\n");
        stringBuilder.append("Your choice: ");
        System.out.print(stringBuilder);
        choice = input.nextInt();
        switch (choice) {
            case (1):
                Cli.introduction();
                break;
            case (2):
                name = Cli.introduction();
                Parity parity = new Parity();
                gamePlay(parity, name);
                break;
            case (3):
                name = Cli.introduction();
                Calculator calculator = new Calculator();
                gamePlay(calculator, name);
                break;
            case (4):
                name = Cli.introduction();
                GCD gcd = new GCD();
                gamePlay(gcd, name);
                break;
            default:
                break;
        }
    }

    public static void gamePlay(GameEngine gameEngine, String name) {
        Scanner input = new Scanner(System.in);
        int count;
        String answer;
        String correctAnswer;
        for (count = 0; count < 3; count++) {
            System.out.println("Question: " + gameEngine.getQuestion());
            System.out.print("Your answer: ");
            answer = input.nextLine();
            correctAnswer = gameEngine.getCorrectAnswer();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'\nLet's try again, " + name + "!");
                break;
            }

        }
        if (count == 3) {
            System.out.println("Congratulations, " + name);
        }
    }
}
