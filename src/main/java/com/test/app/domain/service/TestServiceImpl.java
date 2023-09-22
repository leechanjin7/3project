package com.test.app.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.domain.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper testMapper;

}
