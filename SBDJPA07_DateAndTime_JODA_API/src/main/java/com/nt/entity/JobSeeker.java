package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="JobSeeker_Info")
public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer jsId;
	
	@NonNull
	@Column(length = 30)
	String jsName;
	@NonNull
	@Column(length = 50)
	String jsAddress;
	@NonNull
	LocalDateTime jsDob;
	@NonNull
	LocalTime jsDobTime;
	@NonNull
	LocalDate jsJoiningDate;
	
	
}
