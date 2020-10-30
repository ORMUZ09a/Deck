package com.ORMUZ09a.Tecmilenio;


import java.util.*;


public class Deck {
    private final ArrayList<Card> _deck = new ArrayList<>(53);

    public Deck() { init();}

    public void shuffle(){ Collections.shuffle(_deck); }

    public Card head()throws Exception {
        if (_deck.size() < 1)
            throw new Exception("No hay suficientes cartas");

        return _deck.remove(0);
    }

    public Card pick() throws Exception {
        if (_deck.size() < 1)
            throw new Exception("No hay suficientes cartas");

        return _deck.remove(getRandomIndex());
    }

    public ArrayList<Card> hand() throws Exception {
        ArrayList<Card> _hand =new ArrayList<>();
        _hand.add(head());
        _hand.add(head());
        _hand.add(head());
        _hand.add(head());
        _hand.add(head());

        if (_deck.size() < 4)
            throw  new Exception("No hay suficientes cartas");

        return _hand;
    }

    public int size() {return _deck.size();}

    public void init() {
        if (!_deck.isEmpty()) return;

        for (Map.Entry<String, String> TYPE_COLOR : Card.TYPE_COLOR_MAP.entrySet()) {
            String type = TYPE_COLOR.getKey();
            String color = TYPE_COLOR.getValue();
            for (String value : Card.VALUES){
                _deck.add(new Card(type, color, value));
            }
        }
    }

    public int getRandomIndex(){
        int min = 0;
        int max = _deck.size() - 1;
        return (int) (Math.random() * (max - min) +min);
    }
}

