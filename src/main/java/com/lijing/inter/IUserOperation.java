package com.lijing.inter;

import com.lijing.model.Article;
import com.lijing.model.User;

import java.util.List;

/**
 * Created by puhui on 2016/12/14.
 */
public interface IUserOperation {
    public User selectUserByID(int id);

    public List<User> selectUsers(String userName);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

    public List<Article> getUserArticles(int userid);
}
