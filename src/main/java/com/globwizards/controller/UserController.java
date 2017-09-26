package com.globwizards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globwizards.model.ContentResponse;
import com.globwizards.model.ImmutableContentResponse;
import com.globwizards.model.User;
import com.globwizards.service.UserService;

@RestController
public class UserController {

  @Autowired UserService userService;

  @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
  public ContentResponse<User> getUsers() {

    return ImmutableContentResponse.of(userService.getUsers());
  }
}
