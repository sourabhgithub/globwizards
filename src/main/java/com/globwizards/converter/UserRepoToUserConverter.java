package com.globwizards.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.globwizards.database.UserEntity;
import com.globwizards.model.ImmutableUser;
import com.globwizards.model.User;

@Component
public class UserRepoToUserConverter implements Converter<UserEntity, User> {

  @Override
  public User convert(UserEntity userEntity) {

    return ImmutableUser.of(userEntity.getFirstName(), userEntity.getLastName());
  }
}
