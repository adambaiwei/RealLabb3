import wheels.users.*;
import wheels.users.Frame;
import wheels.users.Rectangle;
import java.awt.*;
import java.awt.event.*;

public class GameBoard extends Frame
{
    private Rectangle _topSide;
    private Rectangle _leftSide;
    private Rectangle _rightSide;
    private static Line bat; //
    private static Rectangle ball;
    static int ballX;
    static int ballY;

    public GameBoard()
    {
        _topSide = new Rectangle(java.awt.Color.black);
        _topSide.setSize(700, 10);
        _topSide.setLocation(0,0);
        _topSide.setFrameColor(java.awt.Color.red);

        _leftSide = new Rectangle(java.awt.Color.black);
        _leftSide.setSize(10, 490);
        _leftSide.setLocation(0,10);

        _rightSide = new Rectangle(java.awt.Color.black);
        _rightSide.setSize(10, 490);
        _rightSide.setLocation(690,10);

        ball = new Rectangle(java.awt.Color.black); // rectangle?
        ball.setSize(15, 15);
//x = 700 y = 500 RAMENS MÅTT
    }
    public static void pause(int ms)
    {
        try 
        {
            Thread.sleep(ms);
        }
        catch (InterruptedException e)
        {
            System.err.format("IOEXception: %s%n", e);
        }
    }
    
    public static void main(String args[])
    {
     GameBoard gameBoard = new GameBoard();
     
     int dx = 1;
     int dy = 1;
     while(true)
     {
     	ballX = ball.getXLocation();
     	ballY = ball.getYLocation();
     	ball.setLocation(ballX + dx,ballY + dy);
     	 if (ballX < 680 && ballX > 10)
     	 {
             dx = dx;
         }
         else {
            dx = -dx;
         }
         if (ballY < 490 && ballY > 10)
         {
             dy = dy;
         }
         else 
         {
             dy = -dy;
         }
         
         if(ballY >= 490)
         {
        	 System.out.println("You lost a life!");
        	 while(true)
        	 {
        		 dy = dy;
        	 }
         }
         ball.setLocation(ballX + dx, ballY + dy);
     	
     	pause(5);
     }
    }
    
}

    /*public static void main(String[] args)
    {
        GameBoard gameboard = new GameBoard();

        int dx = 1;
        int dy = 1;

        while (true)
        {
            ballX = ball.getXLocation();
            ballY = ball.getYLocation();
            if (ballX < 680 && ballX > 10){
                dx = dx;
            }
            else {
               dx = -dx;
            }
            if (ballY < 490 && ballY > 10){
                dy = dy;
            }
            else {
                dy = -dy;
            }
            ball.setLocation(ballX + dx, ballY + dy);
            pause(5);
        }
    }
}*/
