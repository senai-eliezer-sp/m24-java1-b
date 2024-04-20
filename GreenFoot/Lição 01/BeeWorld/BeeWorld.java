import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da Abelha no jogo.
 * 
 * @author Eliezer
 * @version 2024-04-20
 */
public class BeeWorld extends World
{

    /**
     * Constructor da Classe BeeWorld
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Abelha abelha = new Abelha();
        addObject(abelha,127,138);
        abelha.setLocation(138,75);
        Aranha aranha = new Aranha();
        addObject(aranha,208,501);
        Mosca mosca = new Mosca();
        addObject(mosca,682,208);
    }
}
