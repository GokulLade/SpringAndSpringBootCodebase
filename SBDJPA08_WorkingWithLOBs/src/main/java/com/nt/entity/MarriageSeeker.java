package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
@Table(name = "Marriage_Seeker")
public class MarriageSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Integer msId;

	@Column(length = 30)
	@NonNull
	String msName;
	@Column(length = 50)
	@NonNull
	String msAddr;
	@NonNull
	Boolean isIndia;
	@NonNull
	@Lob
	byte[] msImage;
	@NonNull
	@Lob
	char[] msBiodata;

}
