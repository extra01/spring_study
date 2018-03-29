package com.hello.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.hello.dao.User_DAO;

@Service("User_Service")
public class User_Serviceimpl implements User_Service {
	@Resource(name="User_DAO")
    private User_DAO User_DAO;
	@Override
	public Map<String, Object> User_login(Map<String, Object> map)  throws Exception {
		// TODO Auto-generated method stub
		return User_DAO.User_login(map);
	}

}
