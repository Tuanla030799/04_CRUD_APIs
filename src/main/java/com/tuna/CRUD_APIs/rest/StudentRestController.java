package com.tuna.CRUD_APIs.rest;

import com.tuna.CRUD_APIs.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentRestController {
	private List<Student> theStudents;
	
	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Tuan", "lee"));
		theStudents.add(new Student("Linh", "Dinh"));
		theStudents.add(new Student("Tung", "Van"));
	}
	
	@GetMapping("")
	public List<Student> getListStudent () {
		return theStudents;
	}
	
	@GetMapping("/{studentId}")
	public Student getStudentById (@PathVariable int studentId) {
		
		if (studentId >= theStudents.size() || studentId < 0) {
			throw new StudentNotFoundException("Student is not found - " + studentId);
		}
		
		return theStudents.get(studentId);
	}
}
