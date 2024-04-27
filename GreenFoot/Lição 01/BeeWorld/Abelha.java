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
        move(3);
        //Se teclar para esquerda, gira -10°
        if (Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        //Se teclar para direita, gira 10°
        if (Greenfoot.isKeyDown("Right")){
            turn(10);
        }
        //verificando se está nos cantos 
        verificarPosicao();
        //VErifica se toca em uma mosca
        capturaMosca();
    }
    /**
     * Método que verifica se está na direita do mundo 
     */
    public boolean isNaDireita (){
        if (getX() > getWorld().getWidth()-10){
            return true;
        }
        return false;
    }
    /**
     *  Método que verifica se está na esquerda do mundo 
     */
    public boolean isNaEsquerda(){
        return ( getX()<10 );
    }
    /**
     *  Método que verifica se está na base do mundo 
     */
    public boolean isNaBase(){
        return (getY() > getWorld().getHeight()-10 );
    }
    /**
     *  Método que verifica se está no topo do mundo
     */
    public boolean isNoTopo(){
        return(getY() < 10 );
    }
    /**
     * Metodo que verifica se a abelha está nos cantos e reposiciona ela 
     */
    public void verificarPosicao(){
        //Verificando se está na direita 
        if (isNaDireita() ){
            setLocation(10, getY());
        }
        //Verifica se está na esquerda
        if (isNaEsquerda() ){
            setLocation(getWorld().getWidth()-10, getY());
        }
        //Verifica se está na base
        if (isNoTopo() ){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        //Verifica se esta na base do mundo 
        if (isNaBase()){
            setLocation(getX(),10);
        }
    }
    /**
     *  Método que captura a mosca
     */
    public void capturaMosca(){
        //Verificando se tocou em uma mosca
        if (isTouching( Mosca.class )){
            //Remove a mosca rocada.
            removeTouching(Mosca.class); 
            //Adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(new Mosca(), pX, pY);
        }
    }
}
