package com.imran.SpringBoot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imran.SpringBoot.dto.Mobile;

public class MobileServiceImpl implements MobileService
{
	private List<Mobile> mobileList = new ArrayList<Mobile>();

	@Autowired
	private Mobile mobile;

	@Autowired
	private Mobile mobile2;

	@Override
	public Mobile save(Mobile mobile)
	{
		mobileList.add(mobile);
		return null;
	}

	@Override
	public Mobile findById(int id)
	{
		Iterator<Mobile> iterator = mobileList.iterator();
		while (iterator.hasNext())
		{
			Mobile mobile = iterator.next();
			if (mobile.getId() == id)
				return mobile;
		}

			return null;
	}

	@Override
	public List<Mobile> findAll()
	{
		dummyValues();
		return mobileList;
	}

	private void dummyValues()
	{
		mobile.setId(101);
		mobile.setBrand("Samsung");
		mobile.setModel("S10");
		mobile.setPrice(45000);
		mobileList.add(mobile);

		mobile2.setId(102);
		mobile2.setBrand("Apple");
		mobile2.setModel("Iphone 11");
		mobile2.setPrice(45000);
		mobileList.add(mobile2);
	}

}
