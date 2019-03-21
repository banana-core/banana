package com.it.nemo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.it.nemo.dao.UserDao;
import com.it.nemo.service.TestService;
import com.it.nemo.vo.UserVO;

@Service
public class TestServiceImpl implements TestService{

	@Resource
	private UserDao dao;
	
	@Override
	public String test() {
		List<UserVO> l = dao.queryUserList();
		return l.toString();
	}

}
