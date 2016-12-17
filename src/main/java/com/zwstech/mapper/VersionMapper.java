package com.zwstech.mapper;

import com.alibaba.druid.VERSION;
import com.zwstech.domain.User;
import com.zwstech.domain.Version;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by wutairui on 2016/12/14.
 */
@Mapper
public interface VersionMapper {



    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "appNum", column = "app_num"),
            @Result(property = "name", column = "name"),
            @Result(property = "apkName", column = "apk_name"),
            @Result(property = "path", column = "path"),
            @Result(property = "size", column = "size"),
            @Result(property = "flavor", column = "flavor"),
            @Result(property = "version", column = "version"),
            @Result(property = "createTime", column = "create_time")
    })
    @Select("SELECT * FROM VERSION where app_num = #{appNum}")
    List<Version> findByAppNum(@Param("appNum") int appNum);

    @Select("SELECT * FROM VERSION WHERE id = #{id}")
    Version getVersionById(@Param("id") int id);

}
