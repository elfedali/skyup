package ma.weboven.skyup.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.weboven.skyup.repository.UserRepository;
import ma.weboven.skyup.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/users")
    public String getUsers() {
        return "Hello World";
    }

}
