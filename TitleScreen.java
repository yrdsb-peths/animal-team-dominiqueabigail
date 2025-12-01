import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Chan
 * @version November 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Mosquito Muncher", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth() / 2, 200);
        prepare();
    }

    // The main world act loop
    public void act()
    {
        // Start the game if user pressed the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {

        Elephant elephant = new Elephant();
        addObject(elephant,110,322);
        elephant.setLocation(92,312);
        Apple apple = new Apple();
        addObject(apple,170,316);
        apple.setLocation(176,322);
        apple.setLocation(176,322);
        apple.setLocation(185,313);
        Label label = new Label("Use \u2190 and \u2192 to move", 50);
        addObject(label,389,284);
        Label label2 = new Label("Press <space> to start", 50);
        addObject(label2,404,344);
        label2.setLocation(367,357);
        label.setLocation(418,253);
        label.setLocation(200,164);
        label.setLocation(363,129);
        label.setLocation(328,140);
        label2.setLocation(300,204);
        label.setLocation(291,157);
        label.setLocation(305,147);
        elephant.setLocation(93,72);
        apple.setLocation(491,73);
        label2.setLocation(319,349);
        label.setLocation(304,285);
        label.setLocation(302,275);
        label2.setLocation(281,330);
        label2.setLocation(297,341);
    }
}
