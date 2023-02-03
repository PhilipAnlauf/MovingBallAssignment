import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class BallPanel extends JPanel{
    Ball ball = new Ball();
    private int input;

    public BallPanel(){
        setFocusable(true);
        setBackground(Color.RED);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                input = e.getKeyCode();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        ball.drawBall(g);
        if(input == 37){
            ball.moveLeft();
        }

        if(input == 38){
            ball.moveUp();
        }

        if(input == 39){
            ball.moveRight();
        }

        if(input == 40) {
            ball.moveDown();
        }
        ball.moveBall();

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        ball.checkBoundries();
        repaint();
    }
}
