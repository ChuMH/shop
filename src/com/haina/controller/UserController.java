package com.haina.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haina.domain.User;
import com.haina.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(User user,Model m,HttpSession session,HttpServletRequest request,HttpServletResponse response) {
			//µÇÂ½
			User u = userService.login(user);
			if(u!=null) {
				System.out.println("µÇÂ½³É¹¦£¡");
				m.addAttribute("user2", u);
				session.setAttribute("user", u);
				//String pageContext =  request.getContextPath();
				return "forward:/index.jsp";
			}else {
				System.out.println("µÇÂ½Ê§°Ü£¡");
				try {
					response.sendRedirect(request.getContextPath()+"/index.jsp");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return null;
	}
	@RequestMapping("/register")
	public void reg(User u,HttpServletRequest request,HttpServletResponse response) {
		//×¢²á
		userService.register(u);
		try {
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/test")
	public String test(User u) {
		System.out.println(u);
		return "index";
	}
}
