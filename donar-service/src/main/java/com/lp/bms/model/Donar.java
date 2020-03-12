package com.lp.bms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Entity
@Component
@Table(schema = "bloodbank", name = "donar")

public class Donar implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	@NotEmpty
	private String name;

	@NotEmpty
	private int phone_no;

	@NotEmpty
	private String address;

	public Donar(long id, String name, int phone_no, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone_no = phone_no;
		this.address = address;
	}

	public Donar() {

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

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
