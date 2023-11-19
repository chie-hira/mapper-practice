package com.mapper.mapperpractice.mapper;

import com.mapper.mapperpractice.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // MyBatisのMapperである⽬印として@Mapperアノテーションを付与する
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();

    @Select("SELECT name FROM names WHERE id = #{id}")
    String findName(int id);
}
