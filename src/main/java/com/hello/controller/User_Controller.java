package com.hello.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.common.common.CommandMap;
import com.hello.service.User_Service;

@Controller
@RequestMapping(value = "/user")
public class User_Controller {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Resource(name="User_Service")
	  private User_Service User_Service;
	  
	  
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView Loing(Map<String,Object> commandMap) {
		ModelAndView mv = new ModelAndView("auth/login");
		return mv;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView p_login(CommandMap CommandMap) throws Exception{
	Map<String,Object> map =null;
	ModelAndView mv = new ModelAndView("auth/login");
	try {
		map = User_Service.User_login(CommandMap.getMap());
		if(ObjectUtils.isEmpty(map)){
			 mv.addObject("ms", "email 또느 pw를 확인");
			return mv;

		}else{
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
		return mv;
	}
}
