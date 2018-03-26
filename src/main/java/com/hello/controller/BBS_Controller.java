package com.hello.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hello.service.BBS_Service;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/BBS", method = RequestMethod.GET)
public class BBS_Controller {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Resource(name="BBS_Service")
	  private BBS_Service BBS_Service;


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView BBS_list(Map<String,Object> commandMap) {
		 ModelAndView mv = new ModelAndView("/BBS/BBS_list");
	        logger.debug("BBS");
	        
	        List<Map<String,Object>> list = BBS_Service.SelectList(commandMap);
	        mv.addObject("list", list);

	        return mv;
	}
	@RequestMapping(value="/read")
    public ModelAndView BBS_read(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
        logger.debug("인터셉터 테스트");
         
        return mv;
    }
	@RequestMapping(value="/insert")
    public ModelAndView BBS_insert(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
        logger.debug("인터셉터 테스트");
         
        return mv;
    }
	@RequestMapping(value="/update")
    public ModelAndView BBS_update(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
        logger.debug("인터셉터 테스트");
         
        return mv;
    }
	@RequestMapping(value="/delete")
    public ModelAndView BBS_delete(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");
        logger.debug("인터셉터 테스트");
         
        return mv;
    }



	
}
