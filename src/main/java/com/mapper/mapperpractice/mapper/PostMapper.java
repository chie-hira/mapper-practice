package com.mapper.mapperpractice.mapper;


import com.mapper.mapperpractice.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //マッパーだよ宣言
public interface PostMapper {
    @Select("SELECT * FROM posts")
    List<Post> findAll();
}
