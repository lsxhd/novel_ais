package com.only.novel.serviceimpl;


import com.only.novel.entity.Users;
import com.only.novel.mapper.UsersMapper;
import com.only.novel.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Override
    public List<Users> getUsersList() {
        return usersMapper.getUsersList();
    }

    @Override
    public int addUser(Users users) {
        return usersMapper.addUser(users);
    }

    @Override
    public int updateUser(Users users) {
        return usersMapper.updateUser(users);
    }

    @Override
    public int deleteUser(Users users) {
        return usersMapper.deleteUser(users.getId());
    }
}
