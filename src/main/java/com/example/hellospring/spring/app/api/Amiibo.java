package com.example.hellospring.spring.app.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Amiibo {

  private String name;

  public Amiibo() {
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Amiibo{" +
        ", name='" + name + '\'' +
        '}';
  }
}