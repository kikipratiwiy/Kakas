import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 550, 1); 
        prepare();
    }
    public void started()
    {
       if(!MyWorld.music.isPlaying()){
           MyWorld.music.play();
       }
    }
    public void stopped()
    {
        MyWorld.music.stop();
    }
    int counter = 0;
    public void act(){
        counter++;
        if(Score.score<=20){
            if(counter >= 150){
                counter = 0;
                addMusuh();                
            }
        }else if(Score.score<=40){
            if(counter >= 100){
                counter = 0;
                addMusuh();
            }
        }else if(Score.score>=40){
            if(counter >= 50){
                counter = 0;
                addMusuh();
            }
        }
        /*if(Greenfoot.getRandomNumber(200)<2){
            addMusuh();
        } */       
    }
    public void addMusuh(){
        Alien a = new Alien();
        this.addObject(a, Greenfoot.getRandomNumber(400), Greenfoot.getRandomNumber(10));
    }
    private void prepare()
    {

        Player player = new Player();
        addObject(player,203,519);
    }
}
