package com.user.service;

import com.user.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list= List.of(
            new User(1001L,"Rohit","9874563214"),
            new User(1002L,"Mayank","9800113214"),
            new User(1003L,"Shyam","9954560000")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
