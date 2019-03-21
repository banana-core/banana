package com.it.nemo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.it.nemo.service.TestService;

@RestController
@RequestMapping("/demo")
public class TestController {

	@Resource
	private TestService service;
	
	@RequestMapping(value="test", method=RequestMethod.GET)
    public String test() {
        return service.test();
    }
}
