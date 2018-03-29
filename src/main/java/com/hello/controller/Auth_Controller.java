package com.hello.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.common.common.CommandMap;
import com.hello.service.*;
@Controller
@RequestMapping(value = "/auth")
public class Auth_Controller {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Resource(name="Auth_Service")
	  private Auth_Service Auth_Service;
	  
	  
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView Loing(Map<String,Object> commandMap, HttpSession session) {
		ModelAndView mv = new ModelAndView("auth/login");
		if(session.getAttribute("user") != null) {
			mv.setViewName("redirect:/BBS");
		}
		return mv;
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView p_login(CommandMap CommandMap, HttpSession session) throws Exception{
	Map<String,Object> map =null;
	ModelAndView mv = new ModelAndView("auth/login");
	try {
		map = Auth_Service.login(CommandMap.getMap());
		if(ObjectUtils.isEmpty(map)){
			 mv.addObject("ms", "email 또는 pw를 확인");
			return mv;

		}else{
			session.setAttribute("user",map);
			
			mv.setViewName("redirect:/BBS/");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
		return mv;
	}
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public ModelAndView logout(CommandMap CommandMap,HttpServletRequest request) throws Exception{
		Map<String,Object> map =null;
		System.out.println("dd");
		ModelAndView mv = new ModelAndView("redirect:/");
		HttpSession session = request.getSession();
		session.invalidate();
		return mv;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView register () {
		ModelAndView mv = new ModelAndView("auth/register");
		return mv;
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView p_register (CommandMap CommandMap,HttpSession session) {
		ModelAndView mv = new ModelAndView("auth/register");
		System.out.println(CommandMap.getMap().get("name").toString());
		System.out.println(CommandMap.getMap().get("email").toString());
		System.out.println(CommandMap.getMap().get("pw").toString());
		try {
			Auth_Service.register(CommandMap.getMap());
			Map<String, Object> map = Auth_Service.login(CommandMap.getMap());
			session.setAttribute("user",map);
			mv.setViewName("redirect:/BBS/");

		}catch(Exception e) {
			mv.addObject("ms", "입력정보 확인");
		}
		return mv;
	}
}
