import java.awt.*;
import java.util.*;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo{

    private Canvas myCanvas;
    private ArrayList<BouncingBall> balls;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo(){

        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
        balls = new ArrayList<BouncingBall>();
    }

 
    /**
     * Simulate two bouncing balls
     */
    public void bounce(int numberOfBalls){


        Random rand = new Random();
        Dimension size = myCanvas.getSize();
        int h = size.height;
        int w = size.width;
        
        int ground = h - 35;   // position of the ground line
        int xStart = 50;       // x-start of the ground line
        int xLimit = w - 50;   // x-limit of the ground line

        myCanvas.setVisible(true);

        // Draw the ground
        myCanvas.setForegroundColor(Color.blue);
        myCanvas.drawLine(xStart, ground, xLimit, ground);

        if(numberOfBalls < 0){

            System.out.println("Número inválido de bolas!");
            return;

        }else{

            // Crate and show the balls
            for(int i = 0; i < numberOfBalls; i++){

                // Random position
                int xPos = rand.nextInt(w)+1; 
                int yPos = rand.nextInt(h/2) - 20;

                // Random color
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color color = new Color(r, g, b);

                // Random diameter
                int diameter = rand.nextInt(40) + 10;

                // Ball
                BouncingBall ball = new BouncingBall(xPos, yPos, diameter, color, ground, myCanvas);
                balls.add(ball);

            }

        }

        // Drawing the balls
        for(BouncingBall b : balls){
            b.draw();
        }

        // Make them bounce until both have gone beyond the xLimit.
        boolean finished =  false;
        while(!finished){
            myCanvas.wait(50);           // Small delay
            for(BouncingBall b : balls){
                b.move();
                // Stop once ball has travelled a certain distance on x axis
                if(balls.indexOf(b) == balls.size() && b.getXPosition() >= xLimit) {
                    finished = true;
                    b.erase();
                }
            }
        }

    }

    public void drawFrame(){

        myCanvas.erase();

        Dimension size = myCanvas.getSize();
        int h = size.height;
        int w = size.width;

        Rectangle rect = new Rectangle(20, 20, w - 40, h - 40);
        myCanvas.draw(rect);

    }
    
}
