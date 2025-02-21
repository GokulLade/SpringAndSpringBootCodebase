package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@ConfigurationProperties(prefix = "per.info")
@Data
public class PersonInfo {

	//Simple Value
	private String name;
	private String addr;
	private Double salary;
	
	//Array Values
	private Long mobileNo[];
	
	//Collection Values
	private List<String> nickName;
	private Set<String> friends;
	
	//Map Values
	private Map<String,String> idDeatils;
	
	//Has A Properties Values
	private Company company;
	
	
}
