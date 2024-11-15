package com.thesol.taro.models;

import com.thesol.taro.models.qualities.Qualities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HR {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String company;
    private Set<NecessaryQualities> necessaryQualities;
}

// Нужные качества
enum NecessaryQualities implements Qualities {
    RISK, // Риск
    OPPORTUNITY, // Открытость к новым возможностям
    CREATION, // Творчество
    INTUITION, // Интуиция
    INNER_WISDOM, // Внутренняя мудрость
    CREATIVE_ENERGY, // Творческая энергия
    STABILITY, // Стабильность
    DISCIPLINE, // Дисциплина
    TRADITIONS, // Традиции
    MORAL_VALUES, // Моральные ценности
    FIND_A_BALANCE_BETWEEN_CONFLICTING_FORCES, // Найти баланс между противоречивыми силами
    OVERCOMING_OBSTACLES, // Преодовлевание препядствий
    HONESTY, // Честность
    JUSTICE, // Справедливость
    OBJECTIVITY, // Объективность
    INTROSPECTION, // Самоанализ
    READY_FOR_NEW_CHALLENGES, // Готов к новым испытаниям
    COURAGE, // Мужество
    PATIENCE, // Терпение
    HARMONY_IN_ACTIONS, // Гармония в действиях
    ACHIEVING_GOALS // Достижение целей
}
