package service;

import dao.UserDao;
import entity.User;

/**
 * @ClassName UserService
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/02/20/17:10
 */
public class UserService {
    //登录方法
    public User login(User loginUser) {
        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);
//System.out.println("UserService "+ user);
        return user;
    }
    // 注册方法
    public void register(User user) {
        UserDao userDao = new UserDao();
        userDao.register(user);
    }
}
