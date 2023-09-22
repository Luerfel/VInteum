public class Vinteum {
    public static void main(String[] args){
        System.out.println("Bem-vindo ao nosso Blackjack feito em java");
  
        Jogo vinteUm = new Jogo();
        
        Deck testDeck = new Deck();
        testDeck.addCard(new Card(Suit.PAUS, Valores.As));
        testDeck.addCard(new Card(Suit.PAUS, Valores.As));
        testDeck.addCard(new Card(Suit.PAUS, Valores.As));
        testDeck.addCard(new Card(Suit.PAUS, Valores.As));
        Mao testHand = new Mao();
        testHand.pegaCard(testDeck);
        testHand.pegaCard(testDeck);
        testHand.pegaCard(testDeck);
        testHand.pegaCard(testDeck);
        System.out.println("The value of this hand is: " + testHand.calculatedValue());


        
    }
}
