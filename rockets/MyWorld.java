import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Health health ; 
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        health = new Health();

        prepare();
    }
    public Health getHealth(){
        return health;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    
    {
        for(int i = 0;i<25;i++){
            addObject(new Star(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        for(int i = 0;i<25;i++){
            addObject(new Star2(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        for(int i = 0;i<25;i++){
            addObject(new Star3(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        for(int i = 0;i<10;i++){
            addObject(new Asteroid(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        Rocket rocket = new Rocket();
        addObject(rocket,getWidth()/2,getHeight()*9/10);
       
        addObject(health,getWidth()-100,100);
        
         
    }

}
