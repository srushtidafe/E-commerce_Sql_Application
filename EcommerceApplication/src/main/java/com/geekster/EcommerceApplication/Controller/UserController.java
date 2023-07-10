package com.geekster.EcommerceApplication.Controller;

import com.geekster.EcommerceApplication.Model.User;
import com.geekster.EcommerceApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
     @Autowired
     UserService userService;
     @GetMapping("User/Id/{userId}")
     public List<User> getUserById(@PathVariable Iterable<Long> userId){
          return userService.getUserById(userId);
     }
     @PostMapping("User")
     public String addAllUser(@RequestBody User user){
          userService.addAllUser(user);
          return"Added";
     }
}
