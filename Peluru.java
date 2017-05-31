import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        this.setLocation(this.getX(), this.getY()-3);
        if(this.getY() < 5)
        {
            this.getWorld().removeObject(this);
        }
        else if(this.isTouching(Alien.class))
        {
            this.removeTouching(Alien.class);
            Explode b = new Explode();
            this.getWorld().addObject(b, this.getX(), this.getY());
            this.getWorld().removeObject(this);
            Score.score+=2;
            Greenfoot.playSound("blast.wav");
        }
    }    
}
