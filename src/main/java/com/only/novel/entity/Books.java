package com.only.novel.entity;

public class Books {
    private int id;
    private String writer;
    private String book_name;
    private String booktype;
    private String book_intro;
    private String book_pic;
    private String book_source;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBooktype_id() {
        return booktype;
    }

    public void setBooktype_id(String booktype) {
        this.booktype = booktype;
    }

    public String getBook_intro() {
        return book_intro;
    }

    public void setBook_intro(String book_intro) {
        this.book_intro = book_intro;
    }

    public String getBook_pic() {
        return book_pic;
    }

    public void setBook_pic(String book_pic) {
        this.book_pic = book_pic;
    }

    public String getBook_source() {
        return book_source;
    }

    public void setBook_source(String book_source) {
        this.book_source = book_source;
    }
}
