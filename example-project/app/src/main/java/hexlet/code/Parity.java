package hexlet.code;

import java.util.Scanner;

public class Parity {
    private static final int START_OF_RANGE = 0;
    private static final int END_OF_RANGE = 100;
    public static void checkParity() {
        String name = Cli.introduction();
        Scanner input = new Scanner(System.in);
        String answer;
        String correctAnswer;
        int count;
        int currNum;
        System.out.println("Answer 'yes' if number is even, otherwise answer 'no'");
        for (count = 0; count < 3; count++) {
            currNum = START_OF_RANGE + (int) (Math.random() * END_OF_RANGE);
            System.out.println("Question: " + currNum);
            System.out.print("Your answer: ");
            answer = input.nextLine();
            correctAnswer = currNum % 2 == 0 ? "yes" : "no";
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
