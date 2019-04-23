package com.only.novel.mapper;

import com.only.novel.entity.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:lsxh
 * @Date:2019/4/21 20:30
 * @Description:
 */
@Mapper
public interface BookMapper {
    @Select("SELECT books.id,writer,book_name,type_name AS booktype,book_intro,book_pic,book_source FROM \n" +
            "books JOIN booktype \n" +
            "ON books.booktype_id=booktype.type_number ")
    public List<Books> getAllBooks();

    @Select("SELECT books.id,writer,book_name,type_name AS booktype,book_intro,book_pic,book_source\n" +
            "FROM books JOIN booktype \n" +
            "ON books.booktype_id=booktype.type_number \n" +
            "WHERE booktype_id = #{id} LIMIT 4")
    public List<Books> selectBooksByType(int id);

    @Select("select * from books WHERE books.id = #{bookId}")
    public Books getBookByID(int bookId);
}
