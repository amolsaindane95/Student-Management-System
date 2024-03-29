package net.javaguides.springboot.Service;

import java.util.List;

import net.javaguides.springboot.Entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
