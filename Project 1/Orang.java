import greenfoot.*;

public class Orang extends Actor 
{
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
        Actor mobil = getOneIntersectingObject(mobil.class);
        if (mobil != null) {
            int mobilX = mobil.getX();
            int mobilY = mobil.getY();
            World world = getWorld(); // Simpan referensi dunia ke dalam variabel lokal
            if (world != null) { // Periksa apakah dunia masih ada
                world.removeObject(this);
                world.addObject(new Boom(), mobilX, mobilY);
            }
        }
    }
}




