package com.zwstech.service;

import com.zwstech.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wutairui on 2016/12/6.
 */
@Service
public class UserService {

    @Autowired
    private User user;

    public User getUser() {
        return user;
    }
}
