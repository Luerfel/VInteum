import java.security.SecureRandom;

public class DeckOfCards
{
   private Card[] deck; // array do objeto card
   private int currentCard; // indice da proxima card para ser distribuído (0-51)
   private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
   // random number generator
   private static final SecureRandom randomNumbers = new SecureRandom();

   // construtor preenche o baralho de cartas 
   public DeckOfCards()
   {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
      currentCard = 0; // first Card dealt will be deck[0]

      // populate deck with Card objects
      for (int count = 0; count < deck.length; count++) 
         deck[count] = 
            new Card(faces[count % 13], suits[count / 13]);
   } 

   // embaralha o baralho de cartas com um algoritmo de passagem
   public void shuffle()
   {
      // a proxima chamada do metodo dealCard deve começar com o  deck[0] novamente
      currentCard = 0; 

      // para cada carta, escolha outra carta aleatorio (0-51) e troque-as
      for (int first = 0; first < deck.length; first++) 
      {
         // seleciona um numero aleatorio aleatorio de 0-51
         int second =  randomNumbers.nextInt(NUMBER_OF_CARDS);
         
         // troca a carta selecionada pela carta gerada automaticamente 
         Card temp = deck[first];        
         deck[first] = deck[second];   
         deck[second] = temp;            
      } 
   } 

   // distrubui uma carta 
   public Card dealCard()
   {
      // determina se resta carta a serem distribuidas
      if (currentCard < deck.length)
         return deck[currentCard++]; // return current Card in array
      else        
         return null; // return null to indicate that all Cards were dealt
   } 
} // end class DeckOfCards