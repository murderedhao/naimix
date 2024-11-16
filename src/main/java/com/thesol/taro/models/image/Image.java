package com.thesol.taro.models.image;

import com.thesol.taro.models.users.User;
import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private byte[] data;
    @OneToOne(mappedBy = "image", cascade = CascadeType.ALL)
    private User user;
}
