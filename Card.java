
public enum Card {
	ASSASSIN, AMBASSADOR, CAPTAIN, CONTESSA, DUKE;

	public String stringFromType() {

		switch (this) {
		
		case ASSASSIN:
			return "assassin";

		case AMBASSADOR:
			return "ambassador";

		case CAPTAIN:
			return "captain";

		case CONTESSA:
			return "contessa";
			
		case DUKE:
			return "duke";
			
		default:
			return null;
		}
	}
	public boolean equals(Card c) {
		return stringFromType().equals(c.stringFromType());
	}
}
