package com.globwizards.model;

import java.util.List;

import org.immutables.value.Value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

//The builder-based JSON deserialization necessary for HttpMessageMessageConverter to be able to
//correctly handle our immutable, generic wrapper.
@Value.Immutable
@Value.Style(builder = "new")
@JsonDeserialize(builder = ImmutableContentResponse.Builder.class)
public interface ContentResponse<T> {
  @Value.Parameter
  List<T> getContent();
}
