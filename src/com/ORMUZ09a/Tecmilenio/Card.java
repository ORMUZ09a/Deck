package com.ORMUZ09a.Tecmilenio;

import java.util.HashMap;
import java.util.Map;

public class Card {

    public static final HashMap<String, String> TYPE_COLOR_MAP = new HashMap<>(
            Map.of(
                    "Pica","Negro",
                "Corazon","Rojo",
                "Trebol","Negro",
                "Diamnte","Rojo"
            )
            );

    public static final String[] VALUES = {
            "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"
    };

    private final String type;
    private final String color;
    private final String value;

    public Card(String type, String color, String value) {
        this.type = type;
        this.value = value;
        this.color = color;

    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return String.format("{%s, %s, %s}",type, color, value ); }
}