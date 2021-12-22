package com.mountain.mountain.domain.community.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name ="community")
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commupostNo;

    @OneToOne
    @JoinColumn(name = "write_id")
    private String writerId;

    @OneToOne
    @JoinColumn(name = "cate_id")
    private Long cateId;

    @Column(name = "content")
    private String content;

    @Column(name = "fst_reg_dtm")
    private LocalDateTime fstRegDtm;

    @Column(name = "lst_reg_dtm")
    private LocalDateTime lstUpdDtm;

    @Column(name = "view_count")
    private Long viewCount;

    @Column(name = "title")
    private String title;
}
