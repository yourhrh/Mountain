package com.mountain.mountain.domain.community.model;


import com.mountain.mountain.domain.category.model.Category;
import com.mountain.mountain.domain.user.model.User;
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
    private User writerId;

    @OneToOne
    @JoinColumn(name = "cate_id")
    private Category cateId;

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
