package hexlet.code;

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
                Parity.checkParity(name);
                break;
            default:
                break;
        }
    }

}
