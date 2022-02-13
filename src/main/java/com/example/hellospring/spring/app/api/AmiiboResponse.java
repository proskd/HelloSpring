package com.example.hellospring.spring.app.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AmiiboResponse {

  @JsonProperty("amiibo")
  private List<Amiibo> amiibos;

  public AmiiboResponse() {
  }

  @JsonProperty("amiibo")
  public List<Amiibo> getAmiibos() {
    return this.amiibos;
  }

  @JsonProperty("amiibo")
  public void setAmiibos(List<Amiibo> amiibos) {
    this.amiibos = amiibos;
  }
}