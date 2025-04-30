import greenfoot.*;

/**
 * The world our hero lives in.
 * 
 * @author Edward Wang
 * version April 2025
 */

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        createApple();
        
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
