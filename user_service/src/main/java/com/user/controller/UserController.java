package com.user.controller;

import com.user.entities.Contact;
import com.user.entities.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
//        return  userService.getUser(userId);
         User user= userService.getUser(userId);

//        List contact= restTemplate.getForObject("http://localhost:8802/contact/user/1001", List.class);

//        List contact= restTemplate.getForObject("http://localhost:8802/contact/user/"+user.getUserId(), List.class);
        List contact= restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(), List.class);

        user.setContacts(contact);

        return  user;
    }

}
