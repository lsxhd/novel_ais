package com.only.novel.mapper;

import com.only.novel.entity.Users;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersMapper {
    @Select("select * from users ")
    public List<Users> getUsersList();

    @Insert("insert into users (user_name,password) value (#{user_name},#{password} )")
    public int addUser(Users users);

    @Delete("delete from users where id= #{id}")
    public int deleteUser(int id);

    @Update("update users set name=#{name} where id=#{id}")
    public int updateUser(Users users);
}
