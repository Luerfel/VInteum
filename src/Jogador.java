public abstract class Jogador {

    private Mao mao;
    private String nome;

    public Jogador(){
        this.mao = new Mao();
        this.nome = "";
    }



    public Mao getmMao(){
        return this.mao;
    }
    public void setMao(Mao mao){
        this.mao = mao;
    }
    public String getnome(){
        return this.nome;
    }
    public void setName(String nome){
        this.nome = nome;
    }

 
    public void printHand(){
        System.out.println(this.nome + "'essa é a sua Mao:");
        System.out.println(this.mao + " o Valor dela: " + this.mao.calculatedValue());
    }

 
    public void hit(Deck deck, Deck discard){


        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
        System.out.println(this.name + " gets a card");
        this.printHand();
        Game.pause();

    }

    public boolean hasBlackjack(){
        if(this.getHand().calculatedValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }



}