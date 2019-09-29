package com.imran.SpringBoot.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Mobile
{
	private Integer id;
	private String brand;
	private String model;
	private Integer price;
}
