package com.apa.liferay.training.osgi.service;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

@Component(
		service = ClockApi.class
		)

public class ClockImp implements ClockApi{

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}

}
