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
    public static Deck deck;
    public static Player p;
    public static Computer c;
    
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
	for (int i = 0; i < p.getHand().size();i++){
	    // p.getHand().getCard(i).draw(g);
	}
	
    }

    public void define(){
	deck = new Deck();
	p = new Player();
	c = new Computer();
	deck.deal(c,p);
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
