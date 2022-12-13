package com.yoga.admission.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="admission")
public class Students {
	@Id
    @Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
    @Column(name= "name")
    private String name;
    
    @Column(name="address")
    private String address;
    
    @Column(name="age")
    private String age;
    
    
    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getBatches() {
		return batches;
	}

	public void setBatches(String batches) {
		this.batches = batches;
	}

	@Column(name="batches")
    private String batches;
    
}
