package com.hello.dao;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.common.dao.*;
@Repository("BBS_DAO")
public class BBS_DAO extends AbstractDAO{


	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> SelectBBSList(Map<String, Object> map) {
		return (List<Map<String, Object>>)selectList("BBS.selectBoardList", map);

	}
	
	@SuppressWarnings("unchecked")
	public void InsertBBS(Map<String,Object> map){
		insert("BBS.insertBBS",map);
	}
	@SuppressWarnings("unchecked")
	public Map<String, Object> SelectBBS(String idx) {
		update("BBS.BBS_hit",idx);
		return (Map<String, Object>)selectOne("BBS.selectBBS", idx);

	}
	@SuppressWarnings("unchecked")
	public void UpdateBBS(Map<String,Object> map) {
		update("BBS.updateBBS",map); 
	}
	@SuppressWarnings("unchecked")
	public void DeleteBBS(String idx) {
		update("BBS.deleteBBS",idx); 
	}
	
}
