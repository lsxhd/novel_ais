package com.only.novel.controller;

import com.only.novel.entity.BookShelf;
import com.only.novel.service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class BookShelfController {
    @Autowired
    private BookShelfService bookShelfService;

    @GetMapping("/getAllBookShelf")
    public Map<String,Object> getBookShelfList(){

        Map<String,Object> map = new HashMap<>();

        map.put("code",2000);
        map.put("data",bookShelfService.getBookShelfList());
        return map;
    }

    @GetMapping("/insertBookShelf")
    public Object add(BookShelf bookShelf){
        int i = bookShelfService.addBookShelf(bookShelf);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","添加成功！");
        } else {
            map.put("msg","添加失败！");
        }
        return map;
    }

    @GetMapping("/deleteBookShelf")
    public Object delete(BookShelf bookShelf){
        int i = bookShelfService.deleteBookShelf(bookShelf);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","删除成功！");
        } else {
            map.put("msg","删除失败！");
        }
        return map;
    }

    @GetMapping("/updateBookShelf")
    public Object update(BookShelf bookShelf){
        int i = bookShelfService.updateBookShelf(bookShelf);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","更新成功！");
        } else {
            map.put("msg","更新失败！");
        }
        return map;
    }
}
