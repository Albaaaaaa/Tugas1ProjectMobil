import greenfoot.*;
import java.util.Random;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mobil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mobil extends Actor
{
    /**
     * Act - do whatever the mobil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public mobil() {
        GreenfootImage img = this.getImage();
        img.scale(160, 130);
        img.mirrorHorizontally();
        this.setImage(img);
    }
    private int speed = 4; 
    private Random random = new Random();
    
    public void act() {
        if (random.nextInt(100) < 1) {
            // Secara acak pilih untuk mengubah arah setiap beberapa langkah
            randomTurn();
        }
        move(speed);
        
        // Cek apakah mobil berada dekat dengan tepi latar belakang
        if (isCloseToEdge()) {
            avoidWall(); // Panggil metode untuk menghindari dinding
        }
    }
    
    private boolean isCloseToEdge() {
        int edgeDistance = 20; // Jarak dari tepi latar belakang untuk mulai menghindar
        int x = getX();
        int y = getY();
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();
        
        return x <= edgeDistance || x >= width - edgeDistance || y <= edgeDistance || y >= height - edgeDistance;
    }
    
    private void avoidWall() {
        // Implementasi logika untuk menghindari dinding
        // Misalnya, putar mobil sekitar 90 derajat ke kiri
        turn(-90);
        move(speed);
    }
    
    private void randomTurn() {
        // Putar mobil secara acak antara -45 hingga 45 derajat
        int angle = random.nextInt(90) - 45;
        turn(angle);
    }
}
