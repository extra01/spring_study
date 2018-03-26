package com.hello.dao;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.common.dao.*;
@Repository("BBS_DAO")
public class BBS_DAO extends AbstractDAO{


	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> SelectBoardList(Map<String, Object> map) {
		return (List<Map<String, Object>>)selectList("BBS.selectBoardList", map);

	}
	
}
