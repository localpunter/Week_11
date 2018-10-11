import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;


    public Deck() {
        cards = new ArrayList<> ();
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    public void populate() {
        SuitType suitArray[] = SuitType.values();
        RankType rankArray[] = RankType.values();
        for (int i=0; i<suitArray.length; i++) {
            for (int j=0; j<rankArray.length; j++) {
                Card card = new Card(suitArray[i], rankArray[j]);
                cards.add(card);
            }
        }

    }

    public int getCardsDealt() {
        ArrayList<Card> cardsDealt = new ArrayList<>();
        cardsDealt.add(dealCards());
        return cardsDealt.size();
    }

    public Card dealCards() {
        return cards.get(0);
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
