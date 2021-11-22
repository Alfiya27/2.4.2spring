package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    List<User> usersList();
    User getUserById(int id);
    void updateUser(User user);
    void removeUser(int id);

}
