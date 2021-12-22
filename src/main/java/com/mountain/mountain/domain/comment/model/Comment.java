package com.mountain.mountain.domain.comment.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentNo;

    @OneToOne
    @JoinColumn(name = "uid")
    private String uid;

    @OneToOne
    @JoinColumn(name = "mountain_no")
    private Long mountainNo;

    @ManyToOne
    @JoinColumn(name = "commu_no")
    private Long commuNo;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private String writerId;

    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Long cateId;

    @Column(name = "comment_content", length = 300)
    private String commentContent;

    @Column(name = "fst_reg_dtm")
    private LocalDateTime fstRegDtm;

    @Column(name = "lst_reg_dtm")
    private LocalDateTime lstUpdDtm;

}
