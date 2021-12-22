package com.mountain.mountain.domain.mountainimg.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "mountain_img")
public class MountainImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name ="mountain_no")
    private Long mountainNo;

    @Column(name = "img_url")
    private String imgUrl;
}
