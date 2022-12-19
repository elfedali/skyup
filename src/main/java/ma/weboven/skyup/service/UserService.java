package ma.weboven.skyup.service;

import java.util.Collection;

import ma.weboven.skyup.model.UserModel;

public interface UserService {
    // find user by username
    UserModel findByUsername(String username);

    // CRUD
    Collection<UserModel> getUsers();

    void saveUser(UserModel user);

    void updateUser(UserModel user);

    void deleteUser(UserModel user);

}
