package com.nt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Faculty_MTM")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Faculty {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "FID_SEQ", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer fid;
	@Column(length = 20)
	@NonNull
	private String name;
	@Column(length = 20)
	@NonNull
	private String faddress;
	@Column(length = 30)
	@NonNull
	private String subject;

	@ManyToMany(targetEntity = Student.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "JPA_MTM_F_S", joinColumns = @JoinColumn(name = "FACULTY_ID", referencedColumnName = "fid"), inverseJoinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "sid"))
	private Set<Student> students = new HashSet<>();

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", name=" + name + ", faddress=" + faddress + ", subject=" + subject + "]";
	}

}
