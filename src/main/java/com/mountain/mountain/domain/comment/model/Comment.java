package com.mountain.mountain.domain.comment.model;


import com.mountain.mountain.domain.category.model.Category;
import com.mountain.mountain.domain.community.model.Community;
import com.mountain.mountain.domain.mountain.model.Mountain;
import com.mountain.mountain.domain.user.model.User;
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

    @ManyToOne
    @JoinColumn(name = "uid")
    private User user;
    //관계설정시 상대객체 연결 , String x

    @ManyToOne // 데이터 n : 1 매핑 하나의 산에 여러개 댓글
    @JoinColumn(name = "mountain_no")
    private Mountain mountainNo;

    @ManyToOne
    @JoinColumn(name = "commu_no")
    private Community commuNo;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private User writerId;

    @ManyToMany
    @JoinColumn(name = "cate_id")
    private Category cateId;

    @Column(name = "comment_content", length = 300)
    private String commentContent;

    @Column(name = "fst_reg_dtm")
    private LocalDateTime fstRegDtm;

    @Column(name = "lst_reg_dtm")
    private LocalDateTime lstUpdDtm;

}
