package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private long id;
	
	private String studName;
	
	@OneToOne( cascade=CascadeType.ALL)
	@JoinColumn(name="custDocu_id")
	private CustDocu custDocu;

    public long getId() {
		return id;
	}

    public void setId(long id) {
		this.id = id;
	}

    public String getStudName() {
		return studName;
	}

    public void setStudName(String studName) {
		this.studName = studName;
	}

    public CustDocu getCustDocu() {
		return custDocu;
	}

    public void setCustDocu(CustDocu custDocu) {
		this.custDocu = custDocu;
	}
	
}
