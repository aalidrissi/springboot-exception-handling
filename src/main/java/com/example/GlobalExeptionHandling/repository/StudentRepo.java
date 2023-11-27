package com.example.GlobalExeptionHandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GlobalExeptionHandling.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>  {

}
