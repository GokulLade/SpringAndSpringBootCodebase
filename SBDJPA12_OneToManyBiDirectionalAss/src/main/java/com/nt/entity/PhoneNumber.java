package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Person_Phone_Number")
@Setter
@Getter
@RequiredArgsConstructor
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regno;
	@Column(length = 20)
	@NonNull
	private String numberType;
	@NonNull
	private Long phoneNumber;
	@Column(length = 30)
	@NonNull
	private String provider;
	
	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
	@JoinColumn(name="Person_ID", referencedColumnName = "PID")
	private Person person;

	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", numberType=" + numberType + ", phoneNumber=" + phoneNumber
				+ ", provider=" + provider + "]";
	}
	

}
