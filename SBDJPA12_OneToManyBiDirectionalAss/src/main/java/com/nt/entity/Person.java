package com.nt.entity;

//Person.java [Parent Class]
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Person_Info")
@Setter
@Getter
@RequiredArgsConstructor
public class Person {

	@Id
	@SequenceGenerator(name="gen1", sequenceName = "P_ID", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@Column(length = 20)
	@NonNull
	private String pname;
	@Column(length = 20)
	@NonNull
	private String paddr;
	
	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL, mappedBy = "person")
//	@JoinColumn(name = "Person_ID" , referencedColumnName = "PID")
	private Set<PhoneNumber> phones;

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + "]";
	}
	
	
	
}
