package com.hello.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.hello.dao.*;

@Service("BBS_Service")
public class BBS_Serviceimpl implements BBS_Service{
	@Resource(name="BBS_DAO")
    private BBS_DAO BBS_DAO;


	@Override
	public List<Map<String,Object>> SelectList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
		return BBS_DAO.SelectBoardList(map);
		
	}

	@Override
	public void SelectOne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
