import java.util.*;
import java.io.*;
/*=======================================
 Player Class
 -details what a player/user in this game 
 is capable of.
 ========================================*/
public class Player {

    //INSTANCE VARIABLE
    private Hand myHand;

    //CONSTRUCTOR: instantiate player with a hand
    public Player(){
	//myHand = new Hand(cards); // gets it from the Driver class
	myHand = new Hand();
    }


    //ACCESSOR METHOD to the player's hand
    public Hand getHand(){
	return myHand;
    }

}
