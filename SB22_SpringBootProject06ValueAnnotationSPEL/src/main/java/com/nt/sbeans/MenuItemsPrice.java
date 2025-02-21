package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menucard")
@Data
public class MenuItemsPrice {
	
	@Value("${menu.dosaPrice}")
	private Float dosaPrice;
	@Value("${menu.idlyPrice}")
	private Float idlyPrice;
	@Value("${menu.pohaPrice}")
	private Float pohaPrice;
	@Value("${menu.vadaPavPrice}")
	private Float vadaPavPrice;

}
