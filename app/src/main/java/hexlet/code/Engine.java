package hexlet.code;

import hexlet.code.games.*;

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
        stringBuilder.append("5 - Progression\n");
        stringBuilder.append("6 - Prime\n");
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
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                gamePlay(parity, name);
                break;
            case (3):
                name = Cli.introduction();
                Calculator calculator = new Calculator();
                System.out.println("What is the result of the expression?");
                gamePlay(calculator, name);
                break;
            case (4):
                name = Cli.introduction();
                GCD gcd = new GCD();
                System.out.println("Find the greatest common divisor of given numbers.");
                gamePlay(gcd, name);
                break;
            case (5):
                name = Cli.introduction();
                Progression progression = new Progression();
                System.out.println("What number is missing in the progression?");
                gamePlay(progression, name);
                break;
            case (6):
                name = Cli.introduction();
                Prime prime = new Prime();
                System.out.println("Answer 'yes' if given number is prime, Otherwise answer 'no'.");
                gamePlay(prime, name);
                break;
            default:
                break;
        }
    }

    public static void gamePlay(Game gameEngine, String name) {
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
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
