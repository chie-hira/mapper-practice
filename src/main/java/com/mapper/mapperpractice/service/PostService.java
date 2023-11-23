package com.mapper.mapperpractice.service;

import com.mapper.mapperpractice.entity.Post;
import com.mapper.mapperpractice.mapper.PostMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //サービスだよ宣言
public class PostService {
    // final　定数
    private final PostMapper postMapper;

    //コンストラクタインジェクション　呼び出して部品を使えるようにする
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getPosts() {
        return postMapper.findAll();
    }

    public List<Post> searchPostsByTitle(String title) {
        return postMapper.searchPostsByTitle(title);
    }
}
