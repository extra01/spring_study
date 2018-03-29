package com.hello.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.common.common.CommandMap;
import com.hello.service.BBS_Service;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/BBS")
public class BBS_Controller {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Resource(name="BBS_Service")
	  private BBS_Service BBS_Service;


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView BBS_list(Map<String,Object> commandMap) {
		 ModelAndView mv = new ModelAndView("/BBS/BBS_list");
	        logger.debug("BBS");
	        
	        List<Map<String,Object>> list = BBS_Service.SelectList(commandMap);
	        mv.addObject("list", list);

	        return mv;
	}
	@RequestMapping(value="/read/{idx}" , method = RequestMethod.GET)
    public ModelAndView BBS_read(@PathVariable String idx) throws Exception{
        ModelAndView mv = new ModelAndView("BBS/BBS_read");
        Map<String,Object> map = BBS_Service.SelectOne(idx);
        mv.addObject("BBS", map);
        return mv;
    }
	@RequestMapping(value="/insert" , method = RequestMethod.GET)
    public ModelAndView BBS_insert(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("BBS/BBS_insert");
        return mv;
    }
	@RequestMapping(value="/insert" , method = RequestMethod.POST)
    public ModelAndView p_BBS_insert(CommandMap commandMap) throws Exception{
//		if(commandMap.isEmpty() == false){
//	        Iterator<Entry<String,Object>> iterator = commandMap.getMap().entrySet().iterator();
//	        Entry<String,Object> entry = null;
//	        while(iterator.hasNext()){
//	            entry = iterator.next();
//	            logger.debug("key : "+entry.getKey()+", value : "+entry.getValue());
//	        }
//	    }

		ModelAndView mv = new ModelAndView("redirect:/BBS/");
		BBS_Service.insert(commandMap.getMap());
         
        return mv;
    }
	@RequestMapping(value="/update/{idx}", method = RequestMethod.GET)
    public ModelAndView BBS_update(Map<String,Object> commandMap ,@PathVariable String idx) throws Exception{
		 ModelAndView mv = new ModelAndView("BBS/BBS_update");
	        Map<String,Object> map = BBS_Service.SelectOne(idx);
	        mv.addObject("BBS", map);
	        return mv;
    }
	@RequestMapping(value="/update/{idx}", method = RequestMethod.POST)
    public ModelAndView p_BBS_update(CommandMap commandMap ,@PathVariable String idx) throws Exception{
		 ModelAndView mv = new ModelAndView("redirect:/BBS/read/"+idx);
	        BBS_Service.update(commandMap.getMap());
	        return mv;
    }
	
	
	@RequestMapping(value="/delete/{idx}", method = RequestMethod.GET)
    public ModelAndView BBS_delete(@PathVariable String idx) throws Exception{
        ModelAndView mv = new ModelAndView("redirect:/BBS/");
       BBS_Service.delete(idx);
         
        return mv;
    }



	
}
