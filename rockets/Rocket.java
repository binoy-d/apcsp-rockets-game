import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;
    GifImage rocket = new GifImage("rocket_thrust.gif");
    GreenfootSound hit = new GreenfootSound("hit.wav");
    GreenfootSound musac = new GreenfootSound("voyage.wav");
 
    public Rocket(){
        speed = 8;
       
    }
    public void act() 
    {
        setImage(rocket.getCurrentImage());
        
        getImage().scale(51*3/2,96*3/2);
        movement();
        collide();
    }    
    public void movement(){
        if(Greenfoot.isKeyDown("a")){
            this.setRotation(-10);
            this.setLocation(this.getX()-speed,this.getY());
            musac.playLoop();
        }
        else if(Greenfoot.isKeyDown("d")){
            this.setRotation(10);
            this.setLocation(this.getX()+speed,this.getY());
        }
        else{
            this.setRotation(0);
        }
        if(Greenfoot.getRandomNumber(10) == 6)
            this.setLocation(this.getX(),this.getY()-1);
    }
    public void collide(){
        
        if(this.isTouching(Asteroid.class)){
            
            hit.setVolume(75);
            hit.play();
            Health p = (Health)getWorld().getObjects(Health.class).get(0);
            p.setHealth(p.getHealth()-1);
            removeTouching(Asteroid.class);
            getWorld().addObject(new Asteroid(),Greenfoot.getRandomNumber(getWorld().getWidth()),3);
           
        }
    }
}
