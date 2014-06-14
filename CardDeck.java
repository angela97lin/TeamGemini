import java.util.*;
import java.io.*;

public class CardDeck{
    private ArrayList<Card>deck;
    public static ArrayList<Card> half;
    public static ArrayList<String>suits = new ArrayList<String>();

    public static ArrayList<Integer>vals = new ArrayList<Integer>();

    public CardDeck(){
	suits.add("Spade");
	suits.add("Clover");
	suits.add("Hearts");
	suits.add("Diamond");
	for (int i = 0; i <= 13; i++){
	    vals.add(i);
	}
	deck = new ArrayList<Card>();
	for (int i 0; i < suits.size(); i++){
	    for (int j = 1; j < vals.size(); j++){
		Card temp = new Card(vals.get(j), suits.get(i));
		deck.add(temp);
	    }
	}
	
    }


}
