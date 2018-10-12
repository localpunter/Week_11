public class Card {

    private SuitType suit;
    private SuitRank rank;

    public Card(SuitType suit, SuitRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public SuitRank getRank() {
        return this.rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }
}