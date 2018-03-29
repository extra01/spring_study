package com.hello.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.common.dao.AbstractDAO;

@Repository("User_DAO")
public class User_DAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> User_login(Map<String, Object> map) throws Exception {
		return (Map<String, Object>)selectOne("User.User_login", map);

	}

}
