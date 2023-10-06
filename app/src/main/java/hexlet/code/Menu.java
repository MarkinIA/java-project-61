package hexlet.code;

import java.util.Scanner;

public class Menu {
    public static int show() {
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
        return choice;
    }
}
