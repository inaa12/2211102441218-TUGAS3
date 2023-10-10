import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Karakter
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemies(){
        GreenfootImage img = this.getImage();
        img.scale(60, 60);
        this.setImage(img);
        this.setRotation(90);
    }
    
    public void act()
    {
        this.move(6);
        World wrld = this.getWorld();
        
        List<Player> pls = this.getNeighbours(300, true, Player.class);
        if(pls.size()>0){
            this.turnTowards(pls.get(0).getX(),pls.get(0).getY());
        }
        
        if(this.isTouching(Bullet.class)){
            ScoreBoard scoreBoard = wrld.getObjects(ScoreBoard.class).get(0);
            scoreBoard.addScore(1);
            this.removeTouching(Bullet.class);
            wrld.removeObject(this);
            return;
        }
        
        if(this.getY() == wrld.getHeight()-1){
            wrld.removeObject(this);
            return;
        }
        
    }
}
