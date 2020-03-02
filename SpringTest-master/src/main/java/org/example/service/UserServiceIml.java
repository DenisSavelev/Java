package org.example.service;

import org.example.DAO.UserDao;
import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceIml implements UserService{
    @Autowired
    public UserDao userDao;

    @Override
    public void save(User user) {
            userDao.save(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public User getByRussian(String russian) {
        return userDao.getByRussian(russian);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
