package com.mountain.mountain.domain.user.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name ="user_info")
public class User {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "user_img")
    private String userImg;

    @Column(name = "name")
    private String name;
}
