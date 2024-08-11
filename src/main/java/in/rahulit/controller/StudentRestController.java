package in.rahulit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.rahulit.entity.Student;
import in.rahulit.repo.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/students")
	public Iterable<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	@PostMapping("/student")
	public String addStudent(@RequestBody Student student) {
		
		studentRepo.save(student);
		return "Student Saved";
	}
	
	
	
	
}
