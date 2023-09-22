import com.sun.source.tree.PackageTree;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A hand of cards to play with
 */
public class Mao {

    private ArrayList<Card> mao;

    public Mao(){
        mao = new ArrayList<Card>();
    }

    /**
     * Take a single card from the top of this deck and add it to the hand, removing it from the previous deck
     * @param deck The deck of cards we're taking from
     */
    public void pegaCard(Deck deck){
        mao.add(deck.pegarCard());
    }
    public String toString(){
    String output = "";
    for(Card card: mao){
        output += card + " - ";
    }
    return output;
}
 public int calculatedValue(){


        int valor = 0;
        int aceCount = 0;

        for(Card card: mao){

            valor += card.getValores();

            if (card.getValores() == 11){
                aceCount ++;
            }
        }

        if (valor > 21 && aceCount > 0){
            while(aceCount > 0 && valor > 21){
                aceCount --;
                valor -= 10;
            }
        }
        return valor;

    }

    public Card getCard(int idx){
        return mao.get(idx);
    }



}

