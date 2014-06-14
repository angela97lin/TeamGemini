import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Play{
    
    public static Deck deck;
    public static Player p;
    public static Computer c;
    public static CardStack cs;
    public static int placed;

    public Play(){
	define();
    }

    public void define(){
	deck = new Deck();
	p = new Player();
	c = new Computer();
	cs = new CardStack();
	placed = 0;
	deck.deal(c,p);
    }

    public void go(){
	placed = 0;
	for (int i = 0; i < p.getHand().size();i++){
	    if (p.getHand().getCard(i).selected()){
		cs.add(p.getHand().remove(getCard(i)));
		placed ++;
	    }
	}
    }
    
    public void bs(){
	while(placed > 0){
	    cs.pop().changeFace();
	    placed --;
	}
    }
	





    public void draw(Graphics g){
	//int cSpacing = c.getHand().size()*5;
	//int pSpacing = p.getHand().size()*5;
	if (p.getHand().size() > 13){

	    for (int i = 0; i < 13;i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*74)/2))
					    +i*74,450);
	    }
	    for (int i = 13; i < p.getHand().size();i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*74)/2))
					    +(i-13)*74,571);
	    }
	}
	else { 	    
	    for (int i = 0; i < p.getHand().size();i++){
		p.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*74)/2))
					    +i*74,450);
	    }

	}

	if (c.getHand().size() > 13){

	    for (int i = 0; i < 13;i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*74)/2))
					    +i*74,130);
	    }
	    for (int i = 13; i < c.getHand().size();i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*74)/2))
					    +(i-13)*74,9);
	    }
	}

	else {

	    for (int i = 0; i < c.getHand().size();i++){
		c.getHand().getCard(i).draw(g,(GamePlay.myWidth/2
					       -((c.getHand().size()*74)/2))
					    +i*74,130);
	    }
	}
    }

}
