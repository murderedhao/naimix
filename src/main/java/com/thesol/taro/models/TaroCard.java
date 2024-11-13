package com.thesol.taro.models;

import lombok.Getter;

@Getter
public class TaroCard {
    private ArcanaType arcanaType;
    private MajorArcana majorArcana;
    private Suit suit;
    private MinorArcana minorArcana;

    // Конструктор для старших арканов
    public TaroCard(MajorArcana majorArcana) {
        this.arcanaType = ArcanaType.MAJOR;
        this.majorArcana = majorArcana;
    }

    // Конструктор для младших арканов
    public TaroCard(Suit suit, MinorArcana minorArcana) {
        this.suit = suit;
        this.minorArcana = minorArcana;
        this.arcanaType = ArcanaType.MINOR;
    }
}

// Типы арканов
enum ArcanaType {
    MAJOR, MINOR
}

// Старшие арканы
enum MajorArcana {
    FOOL, MAGICIAN, HIGH_PRIESTESS, EMPRESS, EMPEROR, HIEROPHANT, LOVERS,
    CHARIOT, JUSTICE, HERMIT, WHEEL_OF_FORTUNE, STRENGTH, HANGED_MAN,
    DEATH, TEMPERANCE, DEVIL, TOWER, STAR, MOON, SUN, JUDGEMENT, WORLD
}

// Масти младших арканов
enum Suit {
    CUPS, PENTACLES, SWORDS, WANDS
}

// Младшие арканы
enum MinorArcana {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, PAGE, KNIGHT, QUEEN, KING
}
