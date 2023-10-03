package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
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
                Parity.checkParity();
                break;
            case (0):
                break;
            default:
                break;
        }
    }
}
