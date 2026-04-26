import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class TextoColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UPLA");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        JLabel label = new JLabel("UNIVERSIDAD Peruana Los Andes", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        frame.add(label);
        frame.setVisible(true);
    }
}