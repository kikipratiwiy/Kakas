import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 550, 1); 
        prepare();
    }

    public void act(){
        MyWorld.music.stop();
        Score.score = 0;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ulang ulang = new Ulang();
        addObject(ulang,210,384);
        ulang.setLocation(205,377);
        Menu menu = new Menu();
        addObject(menu,215,464);
        menu.setLocation(205,464);
    }
}
