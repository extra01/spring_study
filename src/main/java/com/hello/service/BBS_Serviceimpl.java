package com.hello.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.common.common.CommandMap;
import com.hello.dao.*;

@Service("BBS_Service")
public class BBS_Serviceimpl implements BBS_Service{
	@Resource(name="BBS_DAO")
    private BBS_DAO BBS_DAO;


	@Override
	public List<Map<String,Object>> SelectList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		return BBS_DAO.SelectBBSList(map);
		
	}

	@Override
	public Map<String,Object> SelectOne(String idx) {
		// TODO Auto-generated method stub
		return BBS_DAO.SelectBBS(idx);
	}

	@Override
	public void insert(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		BBS_DAO.InsertBBS(map);
	}

	@Override
	public void update(Map<String, Object> map) {
		// TODO Auto-generated method stub
		BBS_DAO.UpdateBBS(map);
		
	}

	@Override
	public void delete(String idx) {
		// TODO Auto-generated method stub
		BBS_DAO.DeleteBBS(idx);
	}

}
