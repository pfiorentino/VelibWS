/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velibws;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author paul
 */
public class ImagePanel extends JPanel {

    private BufferedImage image;

    public ImagePanel() {
//        try {
//            image = ImageIO.read(new File("/Users/paul/Pictures/td1.jpg"));
//        } catch (IOException ex) {
//            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (image != null){
            g.drawImage(image, 0, 0, null);
        }
    }
    
    public void setImageData(byte[] imageData) {
        try {
            InputStream in = new ByteArrayInputStream(imageData);
            image = ImageIO.read(in);
            this.repaint();
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setImageUrl(String url) {
        try {
            image = ImageIO.read(new URL(url));
            this.repaint();
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
