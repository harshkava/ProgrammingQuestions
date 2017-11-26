package card.games;

public interface CardFactory {

	static Card createCard(int i) {
		
		Card c = new Card(i);
		return null;
	}

}
