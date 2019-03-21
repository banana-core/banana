package com.it.nemo.service.impl;

import org.springframework.stereotype.Service;

import com.it.nemo.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public String test() {
		return "hello world";
	}

}
