package com.ORMUZ09a.Tecmilenio;

import java.util.ArrayList;

public class Game {
    private  Deck deck;

    public Game(){deck = new Deck();}

    public void shuffle();{
        deck.shuffle();
        System.out.println("Se mezclo exitosamente el mazo de cartas. \n");
    }
    public void head();{
        Card card = deck.head();
        System.out.printf("%s\n%d cartas quedan\n%n", card, deck.size());
    }
    public void pick();{
        Card card = deck.pick();
        System.out.printf("%s\n%d cartas quedan\n %n", card, deck.size());
    }
    public void hand();{

        ArrayList<Card> hand = deck.hand();
        for (Card card : hand){
            System.out.println(card);
        }
        System.out.printf("%d cartas quedan \n%n", deck.size());
    }
}
}
