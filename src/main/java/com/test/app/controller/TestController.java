package com.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.app.domain.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class TestController {
	@Autowired
	private TestService testService;

}
