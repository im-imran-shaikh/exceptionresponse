package com.imran.SpringBoot.service;

import java.util.List;

import com.imran.SpringBoot.dto.Mobile;

public interface MobileService
{
	Mobile save(Mobile Mobile);
	
	Mobile findById(int id);
	
	List<Mobile> findAll();
}
