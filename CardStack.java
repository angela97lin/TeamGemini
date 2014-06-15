import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;

public class CardStack{

    private Stack<Card> stack;
    public static int expectedVal;

    public CardStack(){
	stack = new Stack<Card>();
	expectedVal = 1;
    }

    public Card pop(int n){
	stack.peek().reveal(n);
	return stack.pop();
    }

    public int peek(){
	return stack.peek().getIntVal();
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
	c.add(c1);
	System.out.println(c.pop(1));
    }

}
