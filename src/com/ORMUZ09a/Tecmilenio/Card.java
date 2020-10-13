package com.ORMUZ09a.Tecmilenio;

public class Card {
    private int numero;
    private String palo;
    private String color;
    public static final String[] COLOR= {"Rojo","Negro"} ;
    public static final String[] PALOS= {"Picas", "Corazones","Diamantes","Treboles"};
    public static final int Limte_Carta_Palo=13;

    public Card(int numero, String palo, String color) {
        this.numero= numero;
        this.color= color;
        this.palo= palo;


    }
    @Override
    public String toString(){
        return "numero"+ numero + "palo"+ palo +"color"+color;
    }
}