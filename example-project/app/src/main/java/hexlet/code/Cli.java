package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void Introduction() {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("May I have your name?");
        name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
