package com.hello.service;

import java.util.Map;

import javax.annotation.Resource;
import com.hello.dao.Auth_DAO;

import org.springframework.stereotype.Service;

@Service("Auth_Service")
public class Auth_Serviceimpl implements Auth_Service {
	@Resource(name="Auth_DAO")
	private Auth_DAO Auth_DAO;
	@Override
	public Map<String, Object> login(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return Auth_DAO.login(map);
	}
	@Override
	public void register(Map<String,Object> map) throws Exception{
		Auth_DAO.regisger(map);
		// TODO Auto-generated method stub
		
	}
	

}
