import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star2 extends Actor
{
    /**
     * Act - do whatever the Star2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(this.getX(),this.getY()+1);
        if(this.getY()>=getWorld().getHeight()-2)
            setLocation(this.getX(),2);
    }    
}
