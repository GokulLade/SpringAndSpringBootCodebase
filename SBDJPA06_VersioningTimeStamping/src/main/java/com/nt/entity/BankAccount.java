package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="BankAccount")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class BankAccount {
	
	@Id
	@SequenceGenerator(name="gen1", sequenceName = "Acc_Seq", initialValue = 10000,allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Long accountNumber;
	
	@NonNull
	@Column(length = 12)
	private String holderName;
	
	@NonNull
	private Double accountBalance;
	
	@NonNull
	@Column(length = 20)
	private String bankName;
	
	@NonNull
	@Column(length = 10)
	private String accountType;
	
	/* ------------------------ Versioning and Time stamping --------------------------------*/
	@Version
	@Column(name="Update_Count")
	private Integer updateCount;
	
	@CreationTimestamp
	@Column(name="AccOpen_Date", insertable = true)
	private LocalDateTime openingDate;
	
	@Column(name="LastUpdate_Date", insertable = false) // If insertable is false then it will not take the opening date
	@UpdateTimestamp
	private LocalDateTime lastUpdate;

}
