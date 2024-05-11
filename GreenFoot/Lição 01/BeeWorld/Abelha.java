import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Classe Abelha para ser utilizada 
 * 
 * @author Eliezer
 * @version 2024-04-20
 */
public class Abelha extends Actor
{
    //constantes
    public static final int PONTOS = 100;
    //Campos ou Fields
    public int vidas = 0;
    public int score = 0;
    public int imgIdx = 0;
    //Crando campo do tipo conjunto de imagens 
    private GreenfootImage[] imagens;
    //Constructors
    public Abelha(){
        vidas = 3;
        score = 0;
        //Definir o tamanho do conjunto 
        imagens = new GreenfootImage[4]; //defnindo o tamanho do conjunto em 4 elementos
        //Definir as imagens 
        for (int i=0;i<4;i++){
            imagens[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
    }
    /**
     * Método que sera executando quando apertado o botão Act ou Run
     * 
     */
    public void act()
    {
        //Add yourres action code here.
        move(3);
        trocarImagem();
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
        //Verifica se toca em uma mosca
        capturaMosca();
        //Verifica se foi capturada pela aranha
        capturadaPelaAranha();
        //Mostrando as vidas
        mostrarVidas();
        //MOstrando score 
        //mostrarScore();
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
            //Greenfoot.playSound(ouch.wav)
            //Aumentar o score
            //score += PONTOS; //score = score + PONTOS;
            //colocando o score do mundo 
            ((BeeWorld)getWorld()).addScore(PONTOS);
            //Adicionando uma nova mosca no mundo
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(
                new Mosca(Greenfoot.getRandomNumber(5)+1,
                          Greenfoot.getRandomNumber(360)
                          ),
                        pX, pY);
        }
    }
    /**
     * Método que irá capturar a Abelha pela Aranha
     */
    public void capturadaPelaAranha(){
        if (isTouching(Aranha.class)){
            //Greenfoot.playSound(_soundFile_)
            int pX = Greenfoot.getRandomNumber(getWorld().getWidth());
            int pY = Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(pX, pY);
            vidas--; //decrementom
            // vidas = vidas -1:
            if (vidas<1){
                Greenfoot.stop();
                getWorld().showText("GAME OVER", 400, 300);
            }
        }
    }
    
    public void mostrarVidas(){
        getWorld().showText("Vidas: " + vidas, 60, 20);
    }
    
    public void mostrarScore(){
        getWorld().showText("Score: " + score, 700, 20);
    }
    
    public void trocarImagem(){
        setImage(imagens[imgIdx]);
        imgIdx = (imgIdx + 1) % 4;
        //imgIdx++;
        //if (imgIdx>=4){
        //    imgIdx = 0;
        }
    }