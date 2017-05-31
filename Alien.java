import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int getRandomNumber(int start,int end)
    {
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.getRandomNumber(2)<=0){
            this.setLocation(this.getX()+getRandomNumber(3,4), this.getY()+getRandomNumber(1,1));
        }else{
            this.setLocation(this.getX()-getRandomNumber(3,4), this.getY()+getRandomNumber(1,1));
        }
        if(this.getY() >= 540){
            this.getWorld().removeObject(this);
            Greenfoot.delay(10);
            Greenfoot.setWorld(new GameOver());
        }
    }    
}
