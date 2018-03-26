package com.hello.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface BBS_Service {
	
	List<Map<String,Object>> SelectList(Map<String, Object> map);
	public void SelectOne();
	public void insert();
	public void update();
	public void delete();

}
