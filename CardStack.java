import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class CardStack{

    private Stack<Card> stack;
    public static int expectedVal;
    private Stack<Card> lol;
    public static boolean who;

    public CardStack(){
	stack = new Stack<Card>();
	expectedVal = 1;
	lol = new Stack<Card>();
    }

    public void pop(Graphics g,int val){
	stack.peek().reveal(g,val,expectedVal);
	if (!stack.peek().getGo()){
	    who = false;
	}
	lol.push(stack.pop());
	
    }

    public void cardCollection(Hand l, Hand g){
	while(lol.size()>0){
	    if(!who){
		l.add(lol.pop());
	    }
	    else{
		g.add(lol.pop());
	    }
	}
	while(stack.size()>0){
	    if(!who){
		l.add(stack.pop());
	    }
	    else{
		g.add(stack.pop());
	    }
	}
	Play.p.showHand();
	Play.c.hideFace();
	who = true;
	
    }
    
    public int peek(){
	return stack.peek().getIntVal();//returns integer value of card
    }

    public void add(Card c){
	stack.push(c);
	//	expectedVal ++; //issue if we add more than one card at a time 
	c.setXCor(GamePlay.myWidth/2-37);
	c.setYCor(GamePlay.myHeight/2-60);
	c.falseFace();
    }

    public void draw(Graphics g){
	if(stack.size()>0){
	    stack.peek().draw(g);
	}
    }

   
    public static void main(String[] args){
	CardStack c = new CardStack();
	Card c1 = new Card(2,"Clover");
	Card c2 = new Card(3,"Diamond");
	c.add(c1);
	c.add(c2);
	//	System.out.println(c.pop(1));
	System.out.println(c.peek());
	//System.out.println(c.pop(2));
	System.out.println(c.peek());//should be error
    }

}
