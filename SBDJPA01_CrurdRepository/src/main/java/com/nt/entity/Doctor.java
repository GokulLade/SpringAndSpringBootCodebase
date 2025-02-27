package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Doctor_Info")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Doctor {
	
	@Id
	@Column(name = "DOC_ID")
	@SequenceGenerator(name = "gen1", sequenceName = "DOC_ID", allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer docid;
	
	@lombok.NonNull
	@Column(name = "DOC_NAME" , length=25)
	private String docName;
	
	@lombok.NonNull
	@Column(name="DOC_QLY" , length = 25)
	private String qly;
	
	@lombok.NonNull
	@Column(name = "INCOME")
	private Double income;

}
