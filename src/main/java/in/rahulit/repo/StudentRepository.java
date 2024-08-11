package in.rahulit.repo;

import org.springframework.data.repository.CrudRepository;

import in.rahulit.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	
	
}
