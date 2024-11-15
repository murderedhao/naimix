package com.thesol.taro.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private String role = "ROLE_USER";

    // Личные качества
    private byte openness; // Открытость
    private byte honesty; // Честность
    private byte leadership; // Лидерство
    private byte teamPlayer; // Командный игрок

    private String professionalSkills; // Професиональные навыки
    private String motivation; // Мотивация к работе
    private String preferencesInWorkingWithATeam; // Предпочтения в работе с командой

    private int evaluatePersonalQualities() {
        int score = 0;

        score += openness;
        score += honesty * 2;
        score += leadership;
        score += teamPlayer * 3;

        return score;
    }

}

enum Gender {
    MALE, FEMALE
}

