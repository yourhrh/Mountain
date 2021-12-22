package com.mountain.mountain.domain.likedmountain.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="likedmountain")
public class Likedmountain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "uid")
    private String uid;

    @OneToOne
    @JoinColumn(name = "mountain_no")
    private Long mountainNo;


}
