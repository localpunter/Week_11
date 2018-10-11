import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    Deck deck;


    @Before
    public void before() {
        deck = new Deck();
    }


    @Test
    public void deckHasCards() {
        assertEquals(0, deck.getNumberOfCards());
    }

    @Test
    public void populateDeck() {
        deck.populate();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void dealCards() {
        deck.populate();
        deck.dealCards();
        assertEquals(1, deck.getCardsDealt());
    }

    @Test
    public void shuffleDeck() {
        deck.populate();
        Card cardDealt1 = deck.dealCards();
        deck.shuffleDeck();
        Card cardDealt2 = deck.dealCards();
        assertNotEquals(cardDealt1, cardDealt2);
    }
}
