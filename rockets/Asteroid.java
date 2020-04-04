import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Asteroid extends Actor
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed;
    int r = 0;
    int p =0;
    public Asteroid(){
        p = Greenfoot.getRandomNumber(2);
    }
    public void spawn(){
        setImage("asteroid"+(Greenfoot.getRandomNumber(2)+1)+".png");
        
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),3);
        speed = Greenfoot.getRandomNumber(8)+1;
        p = Greenfoot.getRandomNumber(64)+32;
        getImage().scale(p,p);
        setRotation(Greenfoot.getRandomNumber(720)-360);
    }
    public int getDamage(){
      return p/20;
    }

    public void act()
    {
        if(r == 0){
            r =1;
            spawn();
        }
        this.setLocation(this.getX(),this.getY()+speed);
        if(p == 0)
            setRotation(this.getRotation()+speed);
        else
             setRotation(this.getRotation()-speed);
        if(this.getY()>=getWorld().getHeight()-2)
            spawn();
    }
}
