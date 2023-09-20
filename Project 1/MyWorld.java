import greenfoot.*;
import java.util.Random;

public class MyWorld extends World {
    private Random random = new Random();

    public MyWorld() {
        super(1100, 650, 1);
        // ...
        prepare();
    }

    public void act() {
        if (random.nextInt(230) < 1) { // Munculkan "orang" dengan probabilitas 5%
            int randomX = random.nextInt(getWidth()); // Koordinat X acak
            int randomY = random.nextInt(getHeight()); // Koordinat Y acak
            addObject(new Orang(), randomX, randomY); // Tambahkan objek "orang" secara acak
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mobil mobil = new mobil();
        addObject(mobil,216,127);
        mobil.setLocation(112,82);
        mobil mobil2 = new mobil();
        addObject(mobil2,233,498);
        mobil2.setLocation(87,540);
        mobil.setLocation(125,94);
    }
}

