package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{
	@Query("SELECT s FROM Student s where s.scity = ?1")
	public List<Student> findBySage(String sage);
}
