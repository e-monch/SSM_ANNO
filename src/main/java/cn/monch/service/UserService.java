package cn.monch.service;

import cn.monch.dao.UserDao;
import cn.monch.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    public List<User> findAll()
    {
        List<User> all = userDao.findAll();
        return all;
    }

    public List<User> findById(Integer id)
    {
        List<User> byId = userDao.findById(id);
        return byId;
    }

    public List<User> findByName(String name)
    {
        List<User> byName = userDao.findByName("%" + name + "%");
        return byName;
    }

    public List<User> findBySex(Character sex)
    {
        List<User> bySex = userDao.findBySex(sex);
        return bySex;
    }
}
