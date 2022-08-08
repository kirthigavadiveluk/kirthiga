package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerDAO cdao;

	
	
	public CustomerDAO getCdao() {
		return cdao;
	}

	public void setCdao(CustomerDAO cdao) {
		this.cdao = cdao;
	}

	public void saveData(Customer cus) {

		getCdao().save(cus);

	}


	public List<Customer> checkUser(String uname, String upass) {

		return getCdao().CheckUser(uname, upass);

	}

	public List<Customer> checkuid(Customer cus) {
		
		return getCdao().checkuid(cus);
		
	}
	public void updateFlag(int a, String uname, String upass) {
		List<Customer> c = getCdao().CheckUser(uname,upass);
		Iterator<Customer> itr = c.iterator();
		Customer cd = itr.next();
		cd.setFlag(a);
		getCdao().save(cd);
	}

}
