package com.example.go.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.go.dao.BoardMapper;
import com.example.go.dao.UserMapper;
import com.example.go.dto.BoardDto;
import com.example.go.dto.UserDto;
@Controller
public class BoardController {
	BoardDto BoardD;
	@Autowired
    private UserMapper uMapper;
    @Autowired
    private BoardMapper bMapper;
    @RequestMapping("/index")
    public String index(Model model) {
    	BoardD= new BoardDto();
    	List<BoardDto> list = new ArrayList<BoardDto>();
    	list= bMapper.selectAllBoard();
    	model.addAttribute("blist",list);
    	return "index1";
    }

}
