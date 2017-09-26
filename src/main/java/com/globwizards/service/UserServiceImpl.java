package com.globwizards.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globwizards.converter.UserRepoToUserConverter;
import com.globwizards.database.UserEntity;
import com.globwizards.model.User;

@Service
public class UserServiceImpl implements UserService {

  @Autowired UserRepoToUserConverter userRepoToUserConverter;

  @Override
  public List<User> getUsers() {

    List<UserEntity> userList = new ArrayList<UserEntity>();

    UserEntity user1 = new UserEntity("Sourabh", "Verma");
    UserEntity user2 = new UserEntity("Priyanka", "Verma");
    UserEntity user3 = new UserEntity("Angela", "Verma");
    UserEntity user4 = new UserEntity("Vihaan", "Verma");
    userList.add(user1);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);

    return userList.stream().map(userRepoToUserConverter::convert).collect(Collectors.toList());
  }
}
