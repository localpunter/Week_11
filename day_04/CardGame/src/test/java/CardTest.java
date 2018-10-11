import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;


    @Before
    public void before() {
        card = new Card(SuitType.CLUBS, RankType.JACK);

    }

    @Test
    public void cardHasSuit() {
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

    @Test
    public void cardHasRank() {
        assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void rankHasValue() {
        assertEquals(10, card.getRankValue());
    }

}
