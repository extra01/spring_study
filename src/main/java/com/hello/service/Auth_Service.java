package com.hello.service;

import java.util.Map;

public interface Auth_Service {
	Map<String,Object> login(Map<String,Object> map) throws Exception;

	void register(Map<String, Object> map) throws Exception;
}
