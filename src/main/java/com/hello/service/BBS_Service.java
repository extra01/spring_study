package com.hello.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

public interface BBS_Service {
	
	List<Map<String,Object>> SelectList(Map<String, Object> map);
	Map<String,Object> SelectOne(String idx);
	void insert(Map<String, Object> map);
	void update(Map<String, Object> map);
	void delete(String idx);

}
