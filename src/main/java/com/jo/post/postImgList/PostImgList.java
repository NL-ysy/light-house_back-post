package com.jo.post.postImgList;

import com.jo.post.post.model.Post;
import com.jo.post.postImg.PostImg;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class PostImgList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "post_id")
    private Post post;
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "postImg_id")
    private PostImg postImg;

    @Builder
    public PostImgList(Long id, Post post, PostImg postImg){
        this.Id = id;
        this.post = post;
        this.postImg = postImg;
    }
}
