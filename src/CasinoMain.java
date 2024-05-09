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

        for (int f = 1; f <= 4; f = f+1) {
            for (int i = 1; i <= 13; i++) {
                Card c = new Card(i, f);
                deck[i - 1] = c;
                deck[i - 1].printCard();
            }
        }




    }
}
