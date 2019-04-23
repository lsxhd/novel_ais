package com.only.novel.service;



import com.only.novel.entity.Users;

import java.util.List;

public interface UsersService {
    public List<Users> getUsersList();
    public int addUser(Users users);
    public int updateUser(Users users);
    public int deleteUser(Users users);
}
