package com.apa.liferay.training.clock.impl;

import com.apa.liferay.training.clock.api.ClockApi;

import java.util.Date;



public class ClockImpl implements ClockApi {

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return new Date().toString();
	}

}
