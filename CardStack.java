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
    }


}
