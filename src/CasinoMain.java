import java.util.Map;

public class CasinoMain {
    public Card[] deck;
    public Player[] players;

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
            }
        }
        shuffle();
//        printDeck();

        players = new Player[4];
        //construct players array
        for (int p = 0; p < 4; p++){
            players[p] = new Player();
        }

        deal();
    }

    public void shuffle(){
        //first, swap, deck[0] and deck [1] cards

        for (int x = 0; x < 52; x++ ){

            int r = (int)(Math.random()*52);
            Card temp = deck[x];
            deck[x] = deck [r];
            deck[r] = temp;
        }
        //eventually loop through all deck
        //swapping each card into a random index
    }

    public void deal(){

        for (int x = 0; x < players.hand.length; x++){
            players.hand[x] = deck[x];
        }
        players.printHand();


        // print all player hands here with a for loop

    }

    public void printDeck(){
        //for loop to loop through all cards
        //for each card
        for (int i = 0; i < 52; i++){
            deck[i].printCard();
        }
    }


}
