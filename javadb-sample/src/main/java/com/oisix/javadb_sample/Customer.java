package com.oisix.javadb_sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	public Long id;
	public String name;
	public String address;
	public String tel;
	public String email;

}
