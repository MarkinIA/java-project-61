package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String introduction() {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
