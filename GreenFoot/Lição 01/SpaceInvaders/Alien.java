import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author Eliezer
 * @version 2024-04-27
 */
public class Alien extends Actor
{
    public int pX =5;
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(pX);
        if (isAtEdge()){
            pX *= -1; // pX = pX * -1;
            setLocation(getX(), getY()+30);
        }
        if (isTouching(Nave.class)){
            getWorld().showText("GAME OVER", 400, 300);
            Greenfoot.stop();
        }
    }
}
