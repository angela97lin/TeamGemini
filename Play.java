import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Play{
    
    public static Deck deck;
    public static Player p;
    public static Computer c;

    public Play(){
	define();
    }

    public void define(){
	deck = new Deck();
	p = new Player();
	c = new Computer();
	deck.deal(c,p);
    }

    public void draw(Graphics g){
	int cSpacing = c.getHand().size()*5;
	int pSpacing = p.getHand().size()*5;
	if (p.getHand().size() > 25){

	    for (int i = 0; i < p.getHand().size();i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*40,550);
	    }
	}
	else { 	    
	    for (int i = 0; i < p.getHand().size();i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*53,550);
	    }

	}

	if (c.getHand().size() > 25){

	    for (int i = 0; i < c.getHand().size();i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*40,53);
	    }
	}

	else {

       for (int i = 0; i < c.getHand().size();i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*53,53);
       }
	}
    }

}
