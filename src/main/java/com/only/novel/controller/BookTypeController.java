package com.only.novel.controller;

import com.only.novel.entity.BookType;
import com.only.novel.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class BookTypeController {
    @Autowired
    private BookTypeService bookTypeService;

    @GetMapping("/getAllBookType")
    public Map<String,Object> getBookTypeList(){

        Map<String,Object> map = new HashMap<>();

        map.put("code",2000);
        map.put("data",bookTypeService.getBookTypeList());
        return map;
    }

    @GetMapping("/insertBookType")
    public Object add(BookType bookType){
        int i = bookTypeService.addBookType(bookType);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","添加成功！");
        } else {
            map.put("msg","添加失败！");
        }
        return map;
    }

    @GetMapping("/deleteBookType")
    public Object delete(BookType bookType){
        int i = bookTypeService.deleteBookType(bookType);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","删除成功！");
        } else {
            map.put("msg","删除失败！");
        }
        return map;
    }

    @GetMapping("/updateBookType")
    public Object update(BookType bookType){
        int i = bookTypeService.updateBookType(bookType);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg","更新成功！");
        } else {
            map.put("msg","更新失败！");
        }
        return map;
    }
}
