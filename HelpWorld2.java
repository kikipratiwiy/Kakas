import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld2 extends World
{

    /**
     * Constructor for objects of class HelpWorld2.
     * 
     */
    public HelpWorld2()
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
        Credit credit = new Credit();
        addObject(credit,342,517);
        Back2 back2 = new Back2();
        addObject(back2,57,517);
    }
}
