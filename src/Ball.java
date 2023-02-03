import java.awt.*;
import javax.swing.*;
public class Ball{
    private int x;
    private int y;
    private int size;
    private int xSpeed;
    private int ySpeed;

    Ball(){
        x = 250;
        y = 250;
        size = 45;
        xSpeed = 0;
        ySpeed = 0;
    }

    public void drawBall(Graphics newBall){
        newBall.fillOval(x,y,size,size);
    }

    public void moveRight(){
        xSpeed = 10;
    }

    public void moveLeft(){
        xSpeed = -10;
    }


    public void moveUp(){
        ySpeed = -10;
    }

    public void moveDown(){
        ySpeed = 10;
    }

    public void moveBall(){
     x += xSpeed;
     y += ySpeed;
    }

    public void checkBoundries(){
       if(x > 455){
           x = 45;
       }

        if(x < -45){
            x = 455;
        }

        if(y > 455){
            y = 45;
        }

        if(y < -45){
            y = 455;
        }
    }
}