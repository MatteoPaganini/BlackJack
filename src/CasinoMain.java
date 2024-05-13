public class CasinoMain {
    public Card[] deck;
    public static void main(String[] args) {
        CasinoMain m = new CasinoMain();
    }

    public CasinoMain (){
        System.out.println("Game is Starting: Good Luck!");
        //construct deck
        deck = new Card[52];
        //fill

        int counter = 0;
        for (int f = 1; f <= 4; f = f+1) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, f);
                deck[counter] = c;
                counter ++;
//                deck[i - 1].printCard();
            }
        }
        printDeck();
    }

    public void printDeck(){
        //for loop to loop through all cards
        //for each card
        for (int i = 0; i <= 52; i++){
            deck[i].printCard();
        }
    }


}
