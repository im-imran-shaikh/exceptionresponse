package com.imran.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.imran.SpringBoot.dto.Mobile;
import com.imran.SpringBoot.exception.MobileNotFoundEcxeption;
import com.imran.SpringBoot.service.MobileService;

@RestController
public class MobileController
{
	private final String getAllMobiles = "getAllMobiles";
	private final String getMobileById = "getMobileById/{id}";
	
	@Autowired
	private MobileService mobileService;
	
	@GetMapping(getAllMobiles)
	public List<Mobile> getAllMobiles()
	{
		return mobileService.findAll();
	}
	
	@GetMapping(getMobileById)
	public Mobile getMobieById(@PathVariable int id)
	{
		Mobile mobile = mobileService.findById(id);
		if (mobile == null)
		 	throw new MobileNotFoundEcxeption("Id : " + id + " is not found");
		return mobile;
	}
}
