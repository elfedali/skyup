package ma.weboven.skyup.service;

import java.util.Collection;

import ma.weboven.skyup.model.User;

public interface UserService {
    // find user by username
    User findByUsername(String username);

    // CRUD
    Collection<User> getUsers();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

}
