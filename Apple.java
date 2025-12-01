import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public Apple()
    {
        setImage("mosquitobackpain.png");
        
        GreenfootImage mosquito = getImage();
        mosquito.scale(50,50);
        setImage(mosquito);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        World world = getWorld();
        if(getY() >= world.getHeight())
        {
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
