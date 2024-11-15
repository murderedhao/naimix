package com.thesol.taro.models.taro;

import com.thesol.taro.models.qualities.NecessaryQualities;
import com.thesol.taro.models.qualities.Qualities;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

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

    public Set<Qualities> getNecessaryQualities() {
        Set<Qualities> qualities = new HashSet<>();
        if (arcanaType == ArcanaType.MAJOR) {
            switch (majorArcana) {
                case FOOL:
                    qualities.add(NecessaryQualities.RISK);
                    qualities.add(NecessaryQualities.OPPORTUNITY);
                    break;
                case MAGICIAN:
                    qualities.add(NecessaryQualities.CREATION);
                    qualities.add(NecessaryQualities.INNER_WISDOM);
                    break;
                case HIGH_PRIESTESS:
                    qualities.add(NecessaryQualities.INTUITION);
                    qualities.add(NecessaryQualities.INNER_WISDOM);
                    break;
                case EMPRESS:
                    qualities.add(NecessaryQualities.CREATIVE_ENERGY);
                    qualities.add(NecessaryQualities.HARMONY_IN_ACTIONS);
                    break;
                case EMPEROR:
                    qualities.add(NecessaryQualities.STABILITY);
                    qualities.add(NecessaryQualities.DISCIPLINE);
                    break;
                case HIEROPHANT:
                    qualities.add(NecessaryQualities.TRADITIONS);
                    qualities.add(NecessaryQualities.MORAL_VALUES);
                    break;
                case LOVERS:
                    qualities.add(NecessaryQualities.FIND_A_BALANCE_BETWEEN_CONFLICTING_FORCES);
                    break;
                case CHARIOT:
                    qualities.add(NecessaryQualities.OVERCOMING_OBSTACLES);
                    qualities.add(NecessaryQualities.COURAGE);
                    break;
                case JUSTICE:
                    qualities.add(NecessaryQualities.JUSTICE);
                    qualities.add(NecessaryQualities.HONESTY);
                    break;
                case HERMIT:
                    qualities.add(NecessaryQualities.INTROSPECTION);
                    break;
                case WHEEL_OF_FORTUNE:
                    qualities.add(NecessaryQualities.READY_FOR_NEW_CHALLENGES);
                    break;
                case STRENGTH:
                    qualities.add(NecessaryQualities.COURAGE);
                    qualities.add(NecessaryQualities.PATIENCE);
                    break;
                case HANGED_MAN:
                    qualities.add(NecessaryQualities.INTROSPECTION);
                    break;
                case DEATH:
                    // TODO: Придумать полезное качество
                    break;
                case TEMPERANCE:
                    qualities.add(NecessaryQualities.FIND_A_BALANCE_BETWEEN_CONFLICTING_FORCES);
                    break;
                case DEVIL:
                    // TODO: Придумать полезное качество
                    break;
                case TOWER:
                    // TODO: Придумать полезное качество
                    break;
                case STAR:
                    // TODO: Придумать полезное качество
                    break;
                case SUN:
                    // TODO: Придумать полезное качество
                    break;
                case MOON:
                    // TODO: Придумать полезное качество
                    break;
                case JUDGEMENT:
                    // TODO: Придумать полезное качество
                    break;
                case WORLD:
                    // TODO: Придумать полезное качество
                    break;
            }


        }

        return qualities;
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
