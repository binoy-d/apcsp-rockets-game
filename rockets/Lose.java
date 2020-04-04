import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lose extends Actor
{
    /**
     * Act - do whatever the Lose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage p = new GreenfootImage("YOU LOSE",128,Color.GREEN,Color.BLACK);
    public void act() 
    {
        // Add your action code here.
        setImage(p);
    }    
}
