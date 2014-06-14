import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


public class GamePlay extends JPanel implements Runnable{
    
    public Thread thread;
    public static boolean isFirst;
    public static int myWidth,myHeight;
    private BufferedImage myImage;
    
    public GamePlay(){
	thread = new Thread(this);
	thread.start();

	try{
	    myImage = ImageIO.read(new File("background.jpg"));
	}catch(Exception e){}
    }

    public void paintComponent(Graphics g){
	if (isFirst){
	    myWidth = getWidth();
	    myHeight = getHeight();
	    define();
	    
	    isFirst = false;
	}
	g.drawImage(myImage,0,0,getWidth(),getHeight(),this);
	
    }

    private void define(){

    }
    
    public void run(){
	while(true){
	    if(!isFirst){
		
	    }
	    repaint();
	    try{
		thread.sleep(1);//slows down running
	    }catch(Exception e){}
	}
    }





}
