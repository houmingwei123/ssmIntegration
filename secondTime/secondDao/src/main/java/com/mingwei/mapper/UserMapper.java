package com.mingwei.mapper;

import com.mingwei.domain.Items;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from items where id =#{id}")
    Items selectOne(int id);
}
