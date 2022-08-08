package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class UserService {
	@Autowired
	private UserDAO udao;

	public UserDAO getUdao() {
		return udao;
	}

	public void setUdao(UserDAO udao) {
		this.udao = udao;
	}

	public void saveData(UserDTO d) {

		getUdao().save(d);

	}

	public List<UserDTO> checkUser(String name, String pass) {

		return getUdao().CheckUser(name, pass);

	}

	public List<UserDTO> checkuid(UserDTO d) {
		
		return getUdao().checkuid(d);
		
	}
	
}
