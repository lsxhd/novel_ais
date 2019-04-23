package com.only.novel.common;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * @Auther:lsxh
 * @Date:2019/4/22 19:14
 * @Description:
 */
public class ChapterTest {

    Chapter chapter =new Chapter();
    @Test
    public void getChapter() {
        String path = "D:\\novel\\chapter\\1";
        File file = new File(path);
        if( !file.exists() ){
            System.out.println(path + " 路径不存在");
        }
        File [] files = file.listFiles();
        long i = files.length;
        System.out.println(i);

        for (int k = 0;k<46;k++){
            System.out.println("UPDATE `books` SET `book_source`='D:\\\\novel\\\\chapter\\\\"+k+"' WHERE (`id`='"+k+"');");
        }
    }
    @Test
    public void getChapter2(){
        chapter.getChapter("D:\\novel\\chapter\\1\\1.txt");
    }
}