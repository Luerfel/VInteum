public enum Suit {
    PAUS("Paus"),
    OUROS("Ouros"),
    COPAS("Copas"),
    ESPADAS("Espada");

    String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

    public String toString(){
        return suitName;
    }
}