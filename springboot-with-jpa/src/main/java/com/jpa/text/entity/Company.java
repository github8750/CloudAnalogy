package com.jpa.text.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {
	@Column(name="Comany name")
	private String cname;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
}
