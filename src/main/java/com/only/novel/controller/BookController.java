package com.only.novel.controller;

import com.only.novel.entity.Books;
import com.only.novel.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:lsxh
 * @Date:2019/4/21 20:37
 * @Description:
 */
@RestController
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getAllBook")
    public Map<String,Object> getAllBook(){
        Map<String,Object> map = new HashMap<>();
        List<List<Books>> booksList = new ArrayList<>();
        List<List<Books>> booksList2 = new ArrayList<>();
        List<List<Books>> booksList3 = new ArrayList<>();
        map.put("code",2000);
        for (int i=1;i<=9;i++){
            if( i <= 3 ){
                booksList.add(bookService.selectBooksByType(i));
            }else if( i > 3 && i <= 6){
                booksList2.add(bookService.selectBooksByType(i));
            }else if( i >6 && i <= 9){
                booksList3.add(bookService.selectBooksByType(i));
            }
        }
        map.put("dataOne", booksList);
        map.put("dataTwo", booksList2);
        map.put("dataThree", booksList3);
        return map;
    }

    //获取小说章节的个数
    @GetMapping("/getChapterNumber")
    public Map<String,Object> getBookById(int bookId){
        Map<String,Object> map = new HashMap<>();
//        Map<String,Object> bookMap = new HashMap<>();
//        bookMap = bookService.getBookByID(bookId);
//        Books book = (Books) bookMap.get("book");
//        int number = (int) bookMap.get("number");
        map.put("data",bookService.getBookByID(bookId));
        map.put("code",2000);
        return map;
    }

    //按小说id和章节id获取小说章节的内容
    @GetMapping("/getChapter")
    public Map<String,Object> getChapterById(int bookId,int chapterId){
        Map<String,Object> map = new HashMap<>();
        map.put("data",bookService.getChapterByID(bookId,chapterId));
        map.put("code",2000);
        return map;
    }

}
