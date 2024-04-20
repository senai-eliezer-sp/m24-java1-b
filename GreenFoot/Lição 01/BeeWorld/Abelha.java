import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada 
 * 
 * @author Eliezer
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    /**
     * Método que sera executando quando apertado o botão Act ou Run
     */
    public void act()
    {
        //Add yourres action code here.
        move(5);
        //Se teclar para esquerda, gira -10°
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        //Se teclar para direita, gira 10°
        if (Greenfoot.isKeyDown("Right")){
            turn(10);
        }
        if (isAtEdge()){
            turn(180);
        }
        
    }
}
