package com.gontuseries.hellocontroller;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object handler) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayOfWeek ==1 ){
			
			response.getWriter().write("No work on Sundays, try at any other day");
			return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,
			Object handler,ModelAndView modelAndView) throws Exception {
		
		System.out.println("HandlerInterceptorAdapter : spring MVC called the post Handle"
				+ "method for " +request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,
			Object handler,Exception ex) throws Exception {
		
		System.out.println("HandlerInterceptorAdapter : spring MVC called the after completion Handle"
				+ "method for " +request.getRequestURI().toString());
		
	}
	
	
	

}
