package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentDAO sdao;

	public StudentDAO getSdao() {
		return sdao;
	}

	public void setSdao(StudentDAO sdao) {
		this.sdao = sdao;
	}
	public void saveStudent(Student student) {
		getSdao().save(student);
	}
		public List<Student>getStudent(String name){
			return getSdao().findByScity(name);
		}
		public List<Student> getage(int age) {
			
			return getSdao().findBySageGreaterThan(age);
		}
		public List<Student> getScity(String city) {
			
			return getSdao().findByScitySorted(city);
		}
	}

