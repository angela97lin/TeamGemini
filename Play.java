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
	//int cSpacing = c.getHand().size()*5;
	//int pSpacing = p.getHand().size()*5;
	if (p.getHand().size() > 13){

	    for (int i = 0; i < 13;i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*74,450);
	    }
	    for (int i = 13; i < p.getHand().size();i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +(i-10)*74,550);
	    }
	}
	else { 	    
	    for (int i = 0; i < p.getHand().size();i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*74,550);
	    }

	}

	if (c.getHand().size() > 13){

	    for (int i = 0; i < 13;i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*74,53);
	    }
	    for (int i = 13; i < c.getHand().size();i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +(i-10)*74,153);
	    }
	}

	else {

       for (int i = 0; i < c.getHand().size();i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*53)/2))
					    +i*74,53);
       }
	}
    }

}
