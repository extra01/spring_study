package com.common.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	protected Log log = LogFactory.getLog(LoginInterceptor.class);
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    	if (log.isDebugEnabled()) {
            log.debug("======================================          START         ======================================");
            log.debug(" Request URI \t:  " + request.getRequestURI());
        }
    	HttpSession secssion = request.getSession();
    	if(secssion.getAttribute("user") != null) {
    		response.sendRedirect("/study/");	
    		return false;

    	}
        return super.preHandle(request, response, handler);
    }
     
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (log.isDebugEnabled()) {
            log.debug("======================================           END          ======================================\n");
        }
    }


}
