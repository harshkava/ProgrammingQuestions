package card.games;

public class Card<T> implements Comparable<T> {

	int card;
	
	public Card(int i) {
	this.card =i;	
	}

	@Override
	public int compareTo(T o) {
		this.getClass().equals(o.getClass());
		return 0;
	}

}
