package com.it.nemo.dao;

import java.util.List;

import com.it.nemo.vo.UserVO;

public interface UserDao {
	
	public List<UserVO> queryUserList();

}
