import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe BeeWorld que representa o mundo da Abelha no jogo.
 * 
 * @author Eliezer
 * @version 2024-04-20
 */
public class BeeWorld extends World
{
    //Campos e fields
    private Abelha abelha = null;
    private int score;
    private Placar placar = null;
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
        abelha = new Abelha();
        addObject(abelha,127,138);
        abelha.setLocation(138,75);
        
        Aranha aranha = new Aranha();
        addObject(aranha,208,501);
        
        //utilizando o for para criar as moscas
        for (int i=0; i<20; i++){
            int pX = Greenfoot.getRandomNumber(getWidth());
            int pY = Greenfoot.getRandomNumber(getHeight());
            int vel = Greenfoot.getRandomNumber(5)+1;
            int ang = Greenfoot.getRandomNumber(360);
            //Adicionando no mundo e criando a mosca ao mesmo tempo
            addObject(new Mosca(vel,ang), pX, pY);
        }
        //Criando o placar do mundo.
        placar = new Placar();
        addObject(placar ,750, 15);
    }
    /**
     *  getter para obter a instância 
     */
    public Abelha getAbelha(){
        return abelha;
    }
    
    public void addScore(int value){
    score += value; //score = score = value 
    placar.setTexto("Score: " + score);
    }
}
