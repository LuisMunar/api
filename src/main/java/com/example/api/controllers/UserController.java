package com.example.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.models.User;
import com.example.api.models.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private Environment environment;

  // @Value("${ENV_MESSAGE}")
  // private String envMessage;

  @GetMapping({"/with-body"})
  public Map<String, User> getUserWithBody() {
    User user = new User("John Doe", "john.doe@mail.com");
    Map<String, User> body = new HashMap<>();
    body.put("user", user);
    return body;
  }

  @GetMapping({"/with-dto"})
  public UserDto getUserWithDto() {
    User user = new User("John Doe", "john.doe@mail.com");
    UserDto userDto = new UserDto(user);
    return userDto;
  }

  @GetMapping({"/users"})
  public List<User> getUsers() {
    List<User> users = List.of(
      new User("John Doe", "john.doe@mail.com"),
      new User("Rico Lui", "rico.lui@mail.com")
    );
    return users;
  }

  @PostMapping({"/create-user"})
  public User createUser(@RequestBody User user) {
    return user;
  }

  @GetMapping({"/get-environment"})
  public String createUser() {
    return environment.getProperty("config.message", "Default regardless of environment");
  }
}
