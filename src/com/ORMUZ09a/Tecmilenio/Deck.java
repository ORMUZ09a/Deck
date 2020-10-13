package com.ORMUZ09a.Tecmilenio;


import java.util.Random;

public class Deck {
    private Card cards[];
    private int sigCarta;

    public static final int Num_cards= 52;
    private Object Random;

    public Deck() {
        this.cards=new Card[Num_cards];
        this.sigCarta=0;

    }

    private void createDeck() {
        String[] palos = Card.PALOS;

        for (int i = 0; i < palos.length; i++) {
            for (int j=0;j < Card.Limte_Carta_Palo; j++){

            }
        }
    }
    public void shuffle() {
        int Randomposicion=0;
        Card c;
        var Ran= new Random();
        for (int i=0; i<cards.length; i++) {

            Randomposicion = Ran.nextInt(Num_cards-1);

            c= cards[i];
            cards[i] =cards[Randomposicion];
            cards[Randomposicion]=c;

        }
        System.out.println("Se mezclo el deck ");

    }

    

}
