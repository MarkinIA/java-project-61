package hexlet.code;

public class App {
    public static void main(String[] args) {
        int choice;
        choice = Menu.show();
        Engine.gameStart(choice);
    }
}
