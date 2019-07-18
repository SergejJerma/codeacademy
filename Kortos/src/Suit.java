
public enum Suit {

	    clubs ("clubs"),
	    diamonds ("diamonds"),
	    hearts ("hearts") ,
	    spades ("spades");

	    private final String suit;

	    Suit(String s) {
	       this.suit = s;
	    }
	   
	    public String get(){
	        return suit;
	    }
}
