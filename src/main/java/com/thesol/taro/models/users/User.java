package com.thesol.taro.models.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;
    @ElementCollection(targetClass = Gender.class)
    @Enumerated(EnumType.STRING)
    private Set<Gender> gender;


    // Личные качества
    private byte openness; // Открытость
    private byte honesty; // Честность
    private byte leadership; // Лидерство
    private byte teamPlayer; // Командный игрок


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

