package com.example.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.models.User;

@RestController
@RequestMapping("/user")
public class UserController {
  @GetMapping({""})
  public Map<String, User> getUser() {
    User user = new User("John Doe", "john.doe@mail.com");
    Map<String, User> body = new HashMap<>();
    body.put("user", user);
    return body;
  }
}
