package org.k.ImgRes;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Resizing {
    private BufferedImage img;
    private int width;
    private int height;
    
    public Resizing (BufferedImage img, int width, int height){
    this.height = height;
    this.width = width;
    this.img = img;
    }
    public BufferedImage Resize () {
    BufferedImage thumbnail =
    Scalr.resize(img, Scalr.Method.SPEED, Scalr.Mode.FIT_EXACT, width, height, Scalr.OP_ANTIALIAS);
    return thumbnail;
    }
  
    
}
