import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static int keyPressed = 0;

    public static void main(String[] args) {
        JsonLoader jsonLoad = new JsonLoader();
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
