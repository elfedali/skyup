package ma.weboven.skyup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import ma.weboven.skyup.model.User;
import ma.weboven.skyup.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

    // @Autowired
    // UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/u")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/u")
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    public User saveUser(@Valid @RequestBody User user) {
        User u = userRepository.save(user);
        return u;
    }

    @GetMapping("/u/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found with id: " + id));

    }

    // update the user by id
    @PostMapping("/u/{id}")
    public void updateUser(@PathVariable("id") Long id, User user) {
        User userToUpdate = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found with id: " + id));
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPhone(user.getPhone());
        userToUpdate.setAddress(user.getAddress());
        userToUpdate.setCity(user.getCity());
        userToUpdate.setCountry(user.getCountry());
        userToUpdate.setZipCode(user.getZipCode());
        userRepository.save(userToUpdate);
    }

    // delete the user by id
    @PostMapping("/u/delete/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        User userToDelete = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found with id: " + id));
        userRepository.delete(userToDelete);
    }

}
