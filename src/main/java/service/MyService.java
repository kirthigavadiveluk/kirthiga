package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MyDao;

@Service
public class MyService {
	@Autowired
	private MyDao mydao;

	public void service() {
		System.out.println("service called....");
		mydao.dao();
	}

	public MyDao getMydao() {
		return mydao;
	}

	public void setMydao(MyDao mydao) {
		this.mydao = mydao;
	}
}