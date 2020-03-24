package com.example.go;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;

import com.example.go.dao.BoardMapper;
import com.example.go.dao.UserMapper;
import com.example.go.dto.BoardDto;
import com.example.go.dto.UserDto;

@SpringBootConfiguration
public class DemoApplicationTests {
 
    @Autowired
    private UserMapper uMapper;
    @Autowired
    private BoardMapper bMapper;
    

    public void userTest() {
        UserDto user = new UserDto();
        
        
        user.setUserId("test");
        user.setUserPw("test");
        user.setUserName("테스트");
        user.setUserGender("남");
        user.setUserEmail("test@test.test");
        uMapper.insertUser(user);
        
        System.out.println(uMapper.selectOneUser("test"));
    }
    

    public void boardTest() {
        BoardDto board = new BoardDto();
        board.setPassword("1234");
        board.setWriter("test");
        bMapper.insertBoard(board);
        
        System.out.println(bMapper.selectOneBoard(1));
    }
    
}
