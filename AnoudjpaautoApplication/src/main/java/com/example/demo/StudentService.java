package com.example.demo;

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
}
