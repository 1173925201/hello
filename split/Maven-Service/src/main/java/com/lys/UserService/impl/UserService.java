package com.lys.UserService.impl;

import com.lys.Dao.IUserMapper;
import com.lys.UserService.IUserServiceMapper;
import com.lys.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserServiceMapper {

    @Autowired
    private IUserMapper iUserMapper;

    public User findone(Integer id) {
        return iUserMapper.findoneUser(id);
    }
}
