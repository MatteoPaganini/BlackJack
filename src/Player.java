public class Player {
    public String Hand;
    public int points;
    public Card [] hand;
    public Player () {
        hand = new Card[2];
    }

    public void printHand () {
        for (int x = 0; x < hand.length; x++){
            hand[x].printCard();
        }
    }


}
