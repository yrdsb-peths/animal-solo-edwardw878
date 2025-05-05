import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Edward Wang 
 * @version April 2025
 */
public class Apple extends Actor
{
    public void act()
    {
        // Apple falls downwards.
        int x = getX();
        int y = getY()+2;
        setLocation(x,y);
        
        //Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
