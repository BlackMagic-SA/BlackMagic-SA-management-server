package com.sms.blackmagic.controller;


import com.sms.blackmagic.dto.UserDTO;
import com.sms.blackmagic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @PutMapping
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable("user_id") Integer userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/{user_id}")
    public UserDTO getUserById(@PathVariable("user_id") Integer userId) {
        return userService.findUserById(userId);
    }

    @GetMapping("/list")
    public List<UserDTO> getAllUsers() {
        return userService.findAllUsers();
    }

}
