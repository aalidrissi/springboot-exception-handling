package com.example.GlobalExeptionHandling.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GlobalExeptionHandling.model.Student;
import com.example.GlobalExeptionHandling.repository.StudentRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	@Autowired
	private final StudentRepo studentRepo;

	public Student getStudentById(int id)  {
		Optional<Student> findById = studentRepo.findById(id);
//		if (!findById.isPresent()) {
//			throw new StudentNotFoundException(String.format("Student not found with id %s", id));
//		}
		return findById.get();
	}

	public Student saveStudent(Student student) {
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}

	public Student updateStudent(Student student)  {
		Optional<Student> findById = studentRepo.findById(student.getId());
//		if (!findById.isPresent()) {
//			throw new StudentNotFoundException(String.format("Student not found with id %s", student.getId()));
//		}
		Student studentToSave = findById.get();
		BeanUtils.copyProperties(student, studentToSave);
        Student saved = studentRepo.save(studentToSave);
        return saved;
	}


	public void deleteStudent(int id){
		Optional<Student> findById = studentRepo.findById(id);
		Student student = findById.get();
//		Student student = findById
//				.orElseThrow(() -> new StudentNotFoundException(String.format("Student not found with id %s", id)));
//        
		studentRepo.delete(student);
	}

}
