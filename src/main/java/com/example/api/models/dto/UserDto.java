package com.example.api.models.dto;

import com.example.api.models.User;

public class UserDto {
    private User user;

    public UserDto() {
    }

    public UserDto(User user) {
      this.user = user;
    }

    public User getUser() {
      return user;
    }

    public void setUser(User user) {
      this.user = user;
    }
}
