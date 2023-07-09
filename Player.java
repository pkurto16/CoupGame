import java.util.Queue;

public class Player {
	private String name;
	private short cardCount;
	private Card[] cards;
	private boolean[] isAlive;
	
	
	public Player(String name) {
		this.name = name;
		cardCount = 2;
		cards = new Card[4];
		isAlive = new boolean[2];
	}
	
	public Card drawOneCard(Card newCard, int oldCardIndex) {
		Card oldCard = cards[oldCardIndex];
		cards[oldCardIndex] = newCard;
		return oldCard;
	}
	
	public void ambassadorDraw(Card[] newCard) {
		cards[2] = newCard[0];
		cards[3] = newCard[1];
		
	}
	
	public Card exposeCard(int exposedIndex) {
		isAlive[exposedIndex] = false;
		return cards[exposedIndex];
	}
	
	public Card[] getCards() {
		return cards;
	}
}
