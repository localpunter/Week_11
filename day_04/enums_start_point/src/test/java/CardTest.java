import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, SuitRank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS,card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(SuitRank.ACE, card.getRank());
    }

    @Test
    public void aceHasValue1() {
        assertEquals(1, card.getValueFromEnum());
    }

//    @Test
//    public void suitCanBeMispelled() {
//        card = new Card("Heeaarts");
//        assertEquals("Heeaarts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBanans() {
//        card = new Card("Banans");
//        assertEquals("Banans", card.getSuit());
//    }
}