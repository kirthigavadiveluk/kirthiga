package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, Integer> {
	
	@Query("from UserDTO where uname=?1 and upass=?2")
	public List<UserDTO> CheckUser(String name,String pass);
	
	@Query("from UserDTO order by uid ASC")
	public List<UserDTO> checkuid(UserDTO d);
	
	
}
