package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{
	public List<Student> findByScity(String city);
	public List<Student> findBySageGreaterThan(int age);


	@Query("from Student where scity =?1 order by sname")
	public List<Student> findByScitySorted(String city);
}
