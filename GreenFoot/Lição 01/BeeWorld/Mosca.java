import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Mosca destinada a fazer parte do jogo BeeWorld.
 * 
 * @author Eliezer 
 * @version 2024-04-20
 */
public class Mosca extends Inseto
{
    /**
     *  Método Act é executado sempre que apertamos o botão Act ou 
     * ficará em execução quando apertarmos o botão Run
     */
    public void act()
    {
        // Add your action code here.
        move(2);
        verificarCanto();
        
    }
}
