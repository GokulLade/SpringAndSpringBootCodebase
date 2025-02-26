package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Doctor_Info")
@Data
public class Doctor {
	
	@Id
	@Column(name = "DOC_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docid;
	
	@Column(name = "DOC_NAME" , length=25)
	private String docName;
	
	@Column(name="SPECIALIZATION" , length = 25)
	private String specialization;
	
	@Column(name = "INCOME")
	private Double income;

}
