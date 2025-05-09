import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen.
 * 
 * @author Edward Wang 
 * @version May 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 250, getHeight()/5);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Starts game if user presses space bar
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,468,74);
        elephant.setLocation(504,82);
        Label label = new Label("Use \u2190 | \u2192 to move", 40);
        addObject(label,99,229);
        label.setLocation(238,231);
        Label label2 = new Label("Press <space> to start", 40);
        addObject(label2,79,296);
        label2.setLocation(298,295);
        label2.setLocation(233,292);
    }
}
