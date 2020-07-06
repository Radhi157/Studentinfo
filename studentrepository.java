package com.example.backend.repository;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.backend.model.student;
public interface studentrepository extends MongoRepository<student, String> {
    List<student> findBynameContaining(String name);
    
  }