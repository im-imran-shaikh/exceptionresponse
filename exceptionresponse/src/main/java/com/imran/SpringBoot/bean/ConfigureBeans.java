package com.imran.SpringBoot.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.imran.SpringBoot.service.MobileService;
import com.imran.SpringBoot.service.MobileServiceImpl;

@Configuration
public class ConfigureBeans
{
	@Bean
	public MobileService getMobileServiceInstance()
	{
		return new MobileServiceImpl();
	}
}
