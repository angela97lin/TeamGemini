import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.image.*;

// A GUI program is written as a subclass of Frame - the top-level container  
// This subclass inherits all properties from Frame, e.g., title, icon, buttons, content-pane

public class Setting {  

    BufferedImage image, image2;
    public Setting(){
	try {
	    image = ImageIO.read(new File("girl.jpeg"));
	    image2 = ImageIO.read(new File("mafia.png"));
	} catch (IOException e) {}
    }

    public void draw(Graphics g, int x, int y){
	g.drawImage(image, x, y, null);
	g.drawImage(image2, x, y, null);

    }
	



    }


