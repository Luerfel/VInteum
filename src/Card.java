public class Card {


private Suit suit;
private Valores valores;


public Card(Suit suit, Valores valores){
   this.suit = suit;
   this.valores = valores;
}

public int getValores(){
   return valores.rankValue;
}
public Suit getSuit(){
    return suit;
}

public Valores getRank(){
    return valores;
}
public String toString(){
      return ("["+valores+" de "+ suit + "] ("+this.getValores()+")");
}
public Card(Card card){
    this.suit = card.getSuit();
    this.valores = card.getRank();
}

}