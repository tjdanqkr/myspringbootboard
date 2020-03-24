package com.example.go.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.go.dao.BoardMapper;
import com.example.go.dao.UserMapper;
import com.example.go.dto.UserDto;

@Controller
public class HomeController {
	UserDto userdto;
	@Autowired
    private UserMapper uMapper;
    @Autowired
    private BoardMapper bMapper;
	
	@RequestMapping(value = "/")
	public String in() {
		
		return "index";
	}
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {		
		
		return "join";
	}
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joina(HttpServletRequest request) throws Exception{
		request.setCharacterEncoding("UTF-8");
		userdto =new UserDto();
		userdto.setUserEmail(request.getParameter("email"));
		userdto.setUserId(request.getParameter("id"));
		userdto.setUserPw(request.getParameter("pass"));
		userdto.setUserName(request.getParameter("name"));
		userdto.setUserGender(request.getParameter("sex"));
		uMapper.insertUser(userdto);
		return "redirect:/";
	}
	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String logina(HttpServletRequest request ) {
		userdto= new UserDto();
		userdto.setUserId(request.getParameter("id"));
		userdto.setUserPw(request.getParameter("pass"));
		int bool=uMapper.login(userdto);
		System.out.println(bool);
		if (bool==0) {
			return "redirect:/";
		}
		return "redirect:index";
	}
}
