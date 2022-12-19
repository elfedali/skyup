package ma.weboven.skyup.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.weboven.skyup.model.UserModel;
import ma.weboven.skyup.repository.UserRepository;
import ma.weboven.skyup.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserModel findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(UserModel user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(UserModel user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(UserModel user) {
        userRepository.delete(user);
    }

    @Override
    public Collection<UserModel> getUsers() {

        return userRepository.findAll();
    }

}
