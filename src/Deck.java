import java.security.SecureRandom;
import java.util.ArrayList;


public class Deck {

    private ArrayList<Card> deck;

    public Deck(boolean makeDeck){
        deck = new ArrayList<Card>();
        if(makeDeck){
            //Passa por todos os naipes
            for(Suit suit : Suit.values()){
                //Passa por todos os ranks
                for(Valores rank : Valores.values()){
                    //adiciona uma nova carta ao deck com o naipe e rank
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }
    public void addCard(Card card){
        deck.add(card);
    }
    public String toString(){
    
    String output = "";
     
    
    for(Card card: deck){
   
        output += card;
        output += "\n";
    }
    return output;
}
    public void shuffle(){
        ArrayList<Card> shuffled = new ArrayList<Card>();
        while(deck.size()>0){
            int cartaPuxada = (int)(Math.random()*(deck.size()-1));
            shuffled.add(deck.get(cartaPuxada));
            deck.remove(cartaPuxada);
            
        }
        deck = shuffled;
    }

    public Card pegarCard(){

        //Faz uma cópia da carta que será retirada do deck
        Card pegarCard = new Card(deck.get(0));
        //Remove a carta do deck
        deck.remove(0);
        //Devolve a carta que foi retirada
        return pegarCard;

}

}
