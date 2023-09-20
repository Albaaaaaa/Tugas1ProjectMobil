import greenfoot.*;

public class Boom extends Actor {
    private int frame = 0;
    
    public void act() {
        animateBoom();
    }
    
    private void animateBoom() {
        if (frame == 0) {
            GreenfootImage image = new GreenfootImage("boom1.png");
            image.scale(image.getWidth() / 2, image.getHeight() / 2); // Mengubah ukuran gambar menjadi setengahnya
            setImage(image);
        } else if (frame == 10) {
            // Ganti gambar "boom2.png" dan sesuaikan ukuran jika diperlukan
        } else if (frame == 20) {
            // Ganti gambar "boom3.png" dan sesuaikan ukuran jika diperlukan
        } else if (frame == 30) {
            getWorld().removeObject(this);
        }
        
        frame++;
    }
}
