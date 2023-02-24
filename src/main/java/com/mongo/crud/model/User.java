package com.mongo.crud.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "Users")
public class User implements Serializable{

  @Id
  private String id;
  private String name;
  private String nickName;
  private String email;


}