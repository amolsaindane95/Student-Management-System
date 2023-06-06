package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
