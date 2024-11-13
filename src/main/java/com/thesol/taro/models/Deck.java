package com.thesol.taro.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<TaroCard> cards = new ArrayList<TaroCard>();

    public Deck() {
        // Добавление Старших Аркан
        for (MajorArcana major : MajorArcana.values()) {
            cards.add(new TaroCard(major));
        }

        // Добавление младших аркан
        for(Suit suit : Suit.values()) {
            for(MinorArcana minor : MinorArcana.values()) {
                cards.add(new TaroCard(suit, minor));
            }
        }

        Collections.shuffle(cards);
    }

    public TaroCard takeCard() {
        return cards.remove(cards.size() - 1);
    }

}
