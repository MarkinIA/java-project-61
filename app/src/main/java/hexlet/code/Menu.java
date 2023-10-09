package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Menu {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALCULATOR = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void show() {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
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
        int choice = input.nextInt();
        gameStart(choice);
    }

    public static void gameStart(int choice) {
        switch (choice) {
            case (GREET):
                Cli.introduction();
                break;
            case (EVEN):
                Engine.playGame(new Even());
                break;
            case (CALCULATOR):
                Engine.playGame(new Calculator());
                break;
            case (GCD):
                Engine.playGame(new GCD());
                break;
            case (PROGRESSION):
                Engine.playGame(new Progression());
                break;
            case (PRIME):
                Engine.playGame(new Prime());
                break;
            default:
                break;
        }
    }
}
