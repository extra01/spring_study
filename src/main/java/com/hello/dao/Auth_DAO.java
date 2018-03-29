package com.hello.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.common.dao.AbstractDAO;

@Repository("Auth_DAO")
public class Auth_DAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> login(Map<String, Object> map) throws Exception {
		return (Map<String, Object>)selectOne("Auth.login", map);

	}
	@SuppressWarnings("unchecked")
	public void regisger(Map<String, Object> map) throws Exception {
			insert("Auth.register",map);
	}
	

}
