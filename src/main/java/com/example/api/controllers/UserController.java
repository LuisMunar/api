package com.example.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @GetMapping("/user")
  public Map<String, Object> getUser() {
    Map<String, Object> body = new HashMap<>();
    body.put("name", "John Doe");
    body.put("email", "john.code@mail.com");
    return body;
  }
}
