import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static int keyPressed = 0;
    public static JsonLoader jsonLoad = new JsonLoader();

    public static void main(String[] args) {
        if (jsonLoad.options().debug) {
            System.out.println("> Main.java || Program started.\n> Debug mode is turned on! Here's an explanation of the symbols:");
            System.out.println("> > is a normal output. No need to worry about these as they are safe and state that the line works.");
            System.out.println("> \u001B[33m?\u001B[0m is a \u001B[33mwarning output\u001B[0m. Pay a little attention to these as they state that a line may have an issue.");
            System.out.println("> \u001B[31m!\u001B[0m is a \u001B[31msafe error output\u001B[0m. Pay attention to these and take action if necessary as they state that there is an issue with a line that could be causing problems.");
            System.out.println("> \u001B[31m\u001B[40m#!\u001B[0m is a \u001B[31m\u001B[40mfatal error output\u001B[0m. Take action with these as they state that a line is causing the program to crash.");
            System.out.println("> If you are simply a user of this program and you encounter an error, create an issue at \u001B[34mhttps://github.com/DogeKeen/OrangeSMP/issues\u001B[0m.\n> Otherwise, if you're a developer, take the necessary actions to fix it.\n");
        }
        Window win = new Window(jsonLoad.options().screenSize, jsonLoad.options().colourMode, new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key) {
                super.keyPressed(key);
                keyPressed = key.getKeyCode();
            }
        });
        win.setTitle(" OrangeSMP Database | Main Menu ");
    }
}
