package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Customer {
	@Id
	
	private int uid;
	@Size(min=3, max=50)
	private String uname;
	private String upass;
	private String phno;
	private String city;
	private int flag;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
