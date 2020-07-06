package com.example.backend.controller;

import com.example.backend.model.student;
import com.example.backend.repository.studentrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class studentcontroller {
    @Autowired
  studentrepository studrepository; 
  @GetMapping("/student")
public ResponseEntity<List<student>> getstudent(@RequestParam(required = false) String name) {
  try {
    List<student> student = new ArrayList<student>();

    
	if (name == null)
    studrepository.findAll().forEach(student::add);
    else
    studrepository.findBynameContaining(name).forEach(student::add);

    if (student.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    return new ResponseEntity<>(student, HttpStatus.OK);
  } catch (Exception e) {
    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}

@GetMapping("/student/{id}")
public ResponseEntity<student> getstudentById(@PathVariable("id") String id) {
  Optional<student> studentData = studrepository.findById(id);

  if (studentData.isPresent()) {
    return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
  } else {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}

}
