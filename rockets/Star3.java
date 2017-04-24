import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star3 extends Actor
{
    /**
     * Act - do whatever the Star3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(this.getX(),this.getY()+3);
        if(this.getY()>=getWorld().getHeight()-2)
            setLocation(this.getX(),2);
    }    
}
