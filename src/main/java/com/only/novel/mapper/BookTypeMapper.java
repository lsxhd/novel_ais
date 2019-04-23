package com.only.novel.mapper;

import com.only.novel.entity.BookType;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BookTypeMapper {
    @Select("select * from booktype ")
    public List<BookType> getBookTypeList();

    @Insert("insert into booktype (type_name,type_number) value (#{type_name},#{type_number} )")
    public int addBookType(BookType bookType);

    @Delete("delete from booktype where id= #{id}")
    public int deleteBookType(int id);

    @Update("update booktype set name=#{name} where id=#{id}")
    public int updateBookType(BookType bookType);
}
