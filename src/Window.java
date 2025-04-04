import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyListener;

public class Window extends JFrame {
    public Window(String ratio, String colour, KeyListener listener) {
        switch (ratio) {
            case "4:3" -> {
                setSize(1024, 768);
                setExtendedState(NORMAL);
                setLocationRelativeTo(null);
            }
            case "16:9" -> {
                setSize(1368, 768);
                setExtendedState(NORMAL);
                setLocationRelativeTo(null);
            }
            case "16:10" -> {
                setSize(1440, 900);
                setExtendedState(NORMAL);
                setLocationRelativeTo(null);
            }
            case "Maximised" -> {
                setSize(1368, 768);
                setExtendedState(MAXIMIZED_BOTH);
            }
            default -> {
                setSize(1024, 768);
                setExtendedState(NORMAL);
                setLocationRelativeTo(null);
                System.out.println("\"screenSize\" variable is invalid.");
            }
        }

        if (colour.equals("Dark")) {
            getContentPane().setBackground(Color.BLACK);
        } else if (colour.equals("Light")) {
            getContentPane().setBackground(Color.WHITE);
        } else {
            getContentPane().setBackground(Color.BLACK);
            System.out.println("\"colourMode\" variable is invalid.");
        }

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        addKeyListener(listener);
    }
}
