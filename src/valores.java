public enum Valores {
    As("As", 11),     Dois("Dois", 2),      Tres("Tres", 3),      Quatro("Quatro", 4),        Cinco("Cinco", 5),        Seis("Seis", 6), 

    Sete("Sete", 7),  Oito("Oito", 8),      Nove("Nove", 9),        Dez("Dez", 10),         Valete("Valete", 10),       Dama("Dama", 10), 
    
    Rei("Rei", 10); 

    String rankName;
    int rankValor;

    Valores(String rankName, int rankValor){
        this.rankName = rankName;
        this.rankValor = rankValor;
    }

    public String valoresname(){
        return rankName;
    }

    public int rankValor(){
        return rankValor;
    }
}