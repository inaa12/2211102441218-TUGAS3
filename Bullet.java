import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Props
{
    
    int speed = 10;
    public Bullet(){
        GreenfootImage img = this.getImage();
        img.scale(20, 20);
        this.setImage(img);
    }
    
    public  Bullet(int bulletSpeed){
        GreenfootImage img = this.getImage();
        img.scale(30, 20);
        this.setImage(img);
        this.speed = bulletSpeed;
    }
    
    public void act()
    {
        this.move(speed);
    }
}
