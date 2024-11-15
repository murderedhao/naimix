package com.thesol.taro.models.users;

import com.thesol.taro.models.qualities.NecessaryQualities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hr")
public class HR {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String company;
    @ElementCollection(targetClass = NecessaryQualities.class)
    private Set<NecessaryQualities> necessaryQualities;
    private String role = "ROLE_HR";
}
