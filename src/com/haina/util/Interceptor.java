package com.haina.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("a pre Handle");
		HttpSession session = request.getSession();
		Object o =session.getAttribute("user");
		if(o==null) {
			response.sendRedirect(request.getContextPath()+"/index.jsp");
			return false;
		}else
			return true;
	}
}
