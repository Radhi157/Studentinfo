package com.example.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class student {
    @Id
    private String id;
  
    private String name;
    // private String description;
    // private boolean published;
    public student(){

    }
    public student(String name) {
        this.name =name;
    }


    public String getId() {
        return id;
      }
    
      public String getname() {
        return name;
      }
      @Override
  public String toString() {
    return "student [id=" + id + ",name=" + name  + "]";
  }
}
      