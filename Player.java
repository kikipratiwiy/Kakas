import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean pressed = true;
    public void act() 
    {
       // Add your action code here.
       getWorld().showText("Score : "+Score.score,50,20);       
       int x = this.getX();
       int y = this.getY();       
       if(Greenfoot.isKeyDown("up")){
            this.setLocation(x,y-3);
       }
       if(Greenfoot.isKeyDown("down")){
            this.setLocation(x,y+3);
       }
       if(Greenfoot.isKeyDown("left")){
           this.setLocation(x-3,y);
       }
       if(Greenfoot.isKeyDown("right")){
           this.setLocation(x+3,y);
       }
       if(this.pressed == Greenfoot.isKeyDown("space")){          
           this.pressed =! this.pressed;
           if(this.pressed == true){
               Greenfoot.playSound("shoot.wav");
               this.getWorld().addObject(new Peluru(), this.getX(), this.getY() - 40); 
            }          
       } 
       if(this.isTouching(Alien.class))
        {
            Greenfoot.delay(10);
            Greenfoot.setWorld(new GameOver());
        }
    }    
}
