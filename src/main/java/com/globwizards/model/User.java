package com.globwizards.model;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Value.Immutable
@JsonDeserialize(builder = ImmutableUser.class)
public interface User {

  @Value.Parameter
  String getFirstName();

  @Value.Parameter
  String getLastName();
}
