package main;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Bag extends Actor {

    public Bag(int x, int y) {
        super(x, y);
        
        initbag();
    }
    
    private void initbag() {
        
        ImageIcon iicon = new ImageIcon("src/res/bag.png");
        Image image = iicon.getImage();
        setImage(image);
    }

    public void move(int x, int y) {
        
        int dx = x() + x;
        int dy = y() + y;
        
        setX(dx);
        setY(dy);
    }
}