import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditWorld extends World
{

    /**
     * Constructor for objects of class CreditWorld.
     * 
     */
    public CreditWorld()
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
        Menu menu = new Menu();
        addObject(menu,211,515);
        menu.setLocation(203,510);
        menu.setLocation(199,510);
    }
}
