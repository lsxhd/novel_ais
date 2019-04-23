package com.only.novel.common;

import java.io.*;

/**
 * @Auther:lsxh
 * @Date:2019/4/22 19:06
 * @Description:
 */
public class Chapter {

    public int getChapterNumber(String path ){
        File file = new File(path);
        if( !file.exists() ){
            System.out.println(path + " 路径不存在");
            return 0;
        }
        File [] files = file.listFiles();
        int i = files.length;
        System.out.println(i);
        return i;
    }

    public String getChapter(String path){
        String charset = "GB2312";
        File file = new File(path);
        if( !file.exists() ){
            System.out.println(path + " 路径不存在");
        }
        long fileByteLength = file.length();
        byte[] content = new byte[(int)fileByteLength];
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String str = null;
        try {
            str = new String(content,charset);
            System.out.println(str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }
}
