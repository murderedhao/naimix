package com.thesol.taro.models.users;

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
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq_gen")
    @SequenceGenerator(name = "company_seq_gen", sequenceName = "company_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    @OneToMany
    private Set<User> users;
}
