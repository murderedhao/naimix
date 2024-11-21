package com.thesol.taro.models.users;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
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
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<User> users = new HashSet<>();

    public void addUser(User user) {
        users.add(user);
        user.setCompany(this);
    }

    public void removeUser(User user) {
        users.remove(user);
        user.setCompany(null);
    }
}
