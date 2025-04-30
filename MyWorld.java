import greenfoot.*;

/**
 * The world our hero lives in.
 * 
 * @author Edward Wang
 * version April 2025
 */

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld() {
        super(600, 400, 1);
        //Creates elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300); 
        
        //Creates label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        //Creates apple
        createApple();
        
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++; 
        scoreLabel.setValue(score);
    }
    
    /**
     * Creates a new apple at random location at the top
     */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0;
        addObject(apple, x, y);    
    }
}
