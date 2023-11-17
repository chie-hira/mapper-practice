package com.mapper.mapperpractice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // MyBatisのMapperである⽬印として@Mapperアノテーションを付与する
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();
}
