package com.example.demo1.service;

import com.example.demo1.dao.UserDao;
import com.example.demo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDAO;

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
