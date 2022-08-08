package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {
	@Query("from Customer where uname=?1 and upass=?2")
	public List<Customer> CheckUser(String uname,String upass);
	
	@Query("from Customer order by uid ASC")
	public List<Customer> checkuid(Customer cus);
}
