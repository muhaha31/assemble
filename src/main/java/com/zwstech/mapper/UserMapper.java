package com.zwstech.mapper;

import com.zwstech.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by wutairui on 2016/12/6.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{realName}")
    User findByName(@Param("realName") String realName);

    @Update("UPDATE user SET age=#{age} WHERE name=#{name}")
    void update(User user);

    @Insert("INSERT INTO USER(NAME,AGE) VALUES(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") String age);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name,jdbcType=VARCHAR}), #{age,jdbcType=VARCHAR}")
    int insertByMap(Map<String, Object> map);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insertByUser(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void delete(Long id);

    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
    @Select("SELECT name, age FROM user")
    List<User> findAll();
}
