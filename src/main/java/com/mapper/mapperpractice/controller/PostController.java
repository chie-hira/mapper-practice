package com.mapper.mapperpractice.controller;

import com.mapper.mapperpractice.entity.Post;
import com.mapper.mapperpractice.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // コントローラーだよ宣言
public class PostController {
    //
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getPost() {
        List<Post> posts = postService.getPosts();
        return posts;
    }


}
