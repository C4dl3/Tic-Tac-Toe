package com.cadle;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.ImagingOpException;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;
    public ImageLoader(){
        try {
            imgX = ImageIO.read(new File("res/x.png"));
            imgO = ImageIO.read(new File("res/o.png"));
        } catch (ImagingOpException | IOException e) {
            e.printStackTrace();
        }


    }
}
