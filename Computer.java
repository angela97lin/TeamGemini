
//Similar to the Player class; However, everything is randomized.

import java.util.*;
import java.io.*;

public class Computer {

    private Hand hand;
    private ArrayList<String> goodEmotions;
    private ArrayList<String> badEmotions;
    private int trickery; //how good the computer will be at BS-ing
    private int gullibility; //how easily the computer can fall to someone else's BS
    public static int lvl; //Level of difficulty, 1-3 (1 = easy, 2 = medium, 3 = hard)
    
    /*
     * Constructor will set up the Computer's cards as well as level of
     * intelligence
     * The higher the level, the harder it will be to play against it.
     * You can pass values 1-3 into level, else the level will be set to 2
     * automatically.
     *
     * Trickery from 1-21    Easy 1-7, Medium 8-14, Hard 15-21
     * Gullibility from 1-21 Easy 1-7, Medium 8-14, Hard 15-21
     */
    public Computer(){
	lvl = 1;
	hand = new Hand();

	goodEmotions.add("The Computer smiled.");
	goodEmotions.add("The Computer grinned.");
	goodEmotions.add("The Computer has a blank face.");
	goodEmotions.add("The Computer yawned.");
	goodEmotions.add("");
	goodEmotions.add("");
	goodEmotions.add("");

	badEmotions.add("");
	badEmotions.add("");
	badEmotions.add("");
	badEmotions.add("");
	badEmotions.add("");
	badEmotions.add("");
	badEmotions.add("");
    }
    
    public Computer(ArrayList<Card> cards, int lvl){
	hand = new Hand(cards);
        this.lvl = lvl;
	//sets stats based on lvl of the computer
        if(lvl == 1) {
            trickery = (int)(Math.random() * 6) + 1;
            gullibility = (int)(Math.random() * 6) + 1;
        } else if(lvl == 3) {
            trickery = (int)(Math.random() * 6) + 8;
            gullibility = (int)(Math.random() * 6) + 8;
        } else {
            trickery = (int)(Math.random() * 6) + 15;
            gullibility = (int)(Math.random() * 6) + 15;
        }
    }

    /*
     * The String returned by the makeMove() method will be the computer's
     * reactions to the move it just made.
     * This is where the emotions will be showcased. (Ex. "giggled nervously, etc.)
     *
     * makeMove() takes in one parameter, the numerical value of the card it
     * expects next. This is to allow computer to check to see if it has that
     * value.

     */
    /*
    public String makeMove() {
	//	int nextVal = Play.cs.peek();
        String retStr = "";//return string for emotions
        
        if (hand.hasCard(VALUE GOES HERE)) { //if the computer does have a card with
            hand.remove(x);
        }
        return retStr;
    }
    */            
    //public accessor to hand
    public Hand getHand() {
        return hand;
    }
}

