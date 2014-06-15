import java.util.*;
import java.io.*;

public class CardStack{

    private ArrayList<Card> stack;


    public CardStack(){
	stack = new ArrayList<Card>();
    }

    public Card pop(){
	return stack.remove(stack.size()-1);
    }

    public void add(Card c){
	stack.add(c);
	c.setXCor(GamePlay.myWidth/2-37);
	c.setYCor(GamePlay.myHeight/2-60);
    }


}
