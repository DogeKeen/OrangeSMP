import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyListener;

public class Window extends JFrame {
    public Window(String ratio, String colour, KeyListener listener) {
        switch (ratio) {
            case "4:3" -> {
                setSize(1024, 768);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set window size to 1024x768 (4:3).");
                }
                setExtendedState(NORMAL);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set extended state to normal.");
                }
                setLocationRelativeTo(null);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Centred the window.");
                }
            }
            case "16:9" -> {
                setSize(1368, 768);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set window size to 1368x768 (16:9).");
                }
                setExtendedState(NORMAL);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set extended state to normal.");
                }
                setLocationRelativeTo(null);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Centred the window.");
                }
            }
            case "16:10" -> {
                setSize(1440, 900);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set window size to 1440x900 (16:10).");
                }
                setExtendedState(NORMAL);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set extended state to normal.");
                }
                setLocationRelativeTo(null);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Centred the window.");
                }
            }
            case "Maximised" -> {
                setSize(1368, 768);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("? Window.java || Set window size to 1368x768 (16:9).\n?? Line 50 || Window scale is redundant due to the window being maximised.");
                }
                setExtendedState(MAXIMIZED_BOTH);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("> Window.java || Set extended state to maximised.");
                }
            }
            default -> {
                setSize(1024, 768);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("! Window.java || Set window size to 1024x768 (4:3).");
                }
                setExtendedState(NORMAL);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("! Window.java || Set extended state to normal.");
                }
                setLocationRelativeTo(null);
                if (Main.jsonLoad.options().debug) {
                    System.out.println("! Window.java || Centred the window.\n!! Line 7 || The value for \"screenSize\" is invalid. The window has loaded with its default parameters.");
                }
            }
        }

        if (colour.equals("Dark")) {
            getContentPane().setBackground(Color.BLACK);
            if (Main.jsonLoad.options().debug) {
                System.out.println("> Window.java || Set background colour to black.");
            }
        } else if (colour.equals("Light")) {
            getContentPane().setBackground(Color.WHITE);
            if (Main.jsonLoad.options().debug) {
                System.out.println("> Window.java || Set background colour to white.");
            }
        } else {
            getContentPane().setBackground(Color.BLACK);
            if (Main.jsonLoad.options().debug) {
                System.out.println("! Window.java || Set background colour to black.\n!! Line 76 || The value for \"colourMode\" is invalid. The background has been set to its default parameter.");
            }
        }

        setResizable(false);
        if (Main.jsonLoad.options().debug) {
            System.out.println("> Window.java || Disabled resizing.");
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (Main.jsonLoad.options().debug) {
            System.out.println("> Window.java || Program stops when the window is closed.");
        }
        setVisible(true);
        if (Main.jsonLoad.options().debug) {
            System.out.println("> Window.java || Window is visible.");
        }

        addKeyListener(listener);
        if (Main.jsonLoad.options().debug) {
            System.out.println("> Window.java || Listening to key inputs.");
        }
    }
}
