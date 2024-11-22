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
    private String url;

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

    public String getUrl() {
        if (arcanaType == ArcanaType.MAJOR) {
            switch (majorArcana) {
                case FOOL:
                    return "/resources/static/fool.jpg";
                case MAGICIAN:
                    return "/resources/static/mag.jpg";
                case HIGH_PRIESTESS:
                    return "/resources/static/zhrica.jpg";
                case EMPRESS:
                    return "/resources/static/impress.jpg";
                case EMPEROR:
                    return "/resources/static/imperor.jpg";
                case HIEROPHANT:
                    return "/resources/static/hierofant.jpg";
                case LOVERS:
                    return "/resources/static/lovers.jpg";
                case CHARIOT:
                    return "/resources/static/chariot.jpg";
                case JUSTICE:
                    return "/resources/static/justise.jpg";
                case HERMIT:
                    return "/resources/static/hermit.jpg";
                case WHEEL_OF_FORTUNE:
                    return "/resources/static/fortune.jpg";
                case STRENGTH:
                    return "/resources/static/strenghch.jpg";
                case HANGED_MAN:
                    return "/resources/static/hanged_men.jpg";
                case DEATH:
                    return "/resources/static/death.jpg";
                case TEMPERANCE:
                    return "/resources/static/temperam.jpg";
                case DEVIL:
                    return "/resources/static/devil.jpg";
                case TOWER:
                    return "/resources/static/tower.jpg";
                case STAR:
                    return "/resources/static/stare.jpg";
                case SUN:
                    return "/resources/static/sun.jpg";
                case MOON:
                    return "/resources/static/moon.jpg";
                case JUDGEMENT:
                    return "/resources/static/sud.jpg";
                case WORLD:
                    return "/resources/static/world.jpg";
            }
        } else {
            // TODO: Доделать ссылки для карт
        }
        return "";
    }
}
