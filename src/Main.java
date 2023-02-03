import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ballFrame = new JFrame();
        ballFrame.setSize(500,500);
        ballFrame.setBackground(Color.blue);

        JPanel ballPanel = new JPanel();
        ballFrame.add(ballPanel);

        ballFrame.setVisible(true);
    }
}