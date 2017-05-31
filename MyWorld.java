import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static GreenfootSound music = new GreenfootSound("bg.wav"); 
    public void started()
    {
       music.playLoop();
    }
    public void stopped()
    {
        music.stop();
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 550, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
         
        Play play = new Play();
        addObject(play,199,324);
        Help help = new Help();
        addObject(help,199,400);
    }
}
