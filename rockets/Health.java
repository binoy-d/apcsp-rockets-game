import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    /**
     * Act - do whatever the Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int health;
    int distanceleft = 0;
    public Health(){
        health = 20;
        distanceleft = Greenfoot.getRandomNumber(1000)+6000;
    }
    public void setHealth(int h){
        health = h;
    }
    public int getHealth(){
        return health;
    }
    public void act() 
    {
        // Add your action code here
        setImage(new GreenfootImage("Health: "+health+"\nDistance Left: "+distanceleft, 24, Color.WHITE,Color.BLACK));
        distanceleft--;
        if(health<=0){
            Greenfoot.setWorld(new LoseScreen());
        }
        if(distanceleft<=0){
            Greenfoot.setWorld(new WinScreen());
        }
    }    
}
